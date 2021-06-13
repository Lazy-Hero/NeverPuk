package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import net.n2.c;
import net.n2.h;
import net.nx.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z extends ChannelInboundHandlerAdapter {
   private static final Logger h = LogManager.getLogger();
   private final c w;

   public z(c var1) {
      this.w = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      h.X();
      ByteBuf var4 = (ByteBuf)var2;
      var4.markReaderIndex();
      boolean var5 = true;
      if(var4.readUnsignedByte() == 254) {
         InetSocketAddress var6 = (InetSocketAddress)var1.channel().remoteAddress();
         f var7 = this.w.Z();
         int var8 = var4.readableBytes();
         switch(var8) {
         case 0:
            h.debug("Ping: (<1.3.x) from {}:{}", var6.getAddress(), Integer.valueOf(var6.getPort()));
            String var9 = String.format("%s§%d§%d", new Object[]{var7.t(), Integer.valueOf(var7.V()), Integer.valueOf(var7.P())});
            this.K(var1, this.Q(var9));
         case 1:
            if(var4.readUnsignedByte() != 1) {
               var4.resetReaderIndex();
               var1.channel().pipeline().remove("legacy_query");
               var1.fireChannelRead(var2);
               return;
            } else {
               h.debug("Ping: (1.4-1.5.x) from {}:{}", var6.getAddress(), Integer.valueOf(var6.getPort()));
               String var10 = String.format("§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", new Object[]{Integer.valueOf(127), var7.G(), var7.t(), Integer.valueOf(var7.V()), Integer.valueOf(var7.P())});
               this.K(var1, this.Q(var10));
            }
         default:
            boolean var11 = var4.readUnsignedByte() == 1;
            var11 = var11 & var4.readUnsignedByte() == 250;
            var11 = var11 & "MC|PingHost".equals(new String(var4.readBytes(var4.readShort() * 2).array(), StandardCharsets.UTF_16BE));
            int var12 = var4.readUnsignedShort();
            var11 = var11 & var4.readUnsignedByte() >= 73;
            var11 = var11 & 3 + var4.readBytes(var4.readShort() * 2).array().length + 4 == var12;
            var11 = var11 & var4.readInt() <= '\uffff';
            var11 = var11 & var4.readableBytes() == 0;
            var4.resetReaderIndex();
            var1.channel().pipeline().remove("legacy_query");
            var1.fireChannelRead(var2);
         }
      } else {
         var4.resetReaderIndex();
         var1.channel().pipeline().remove("legacy_query");
         var1.fireChannelRead(var2);
      }
   }

   private void K(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   private ByteBuf Q(String var1) {
      ByteBuf var2 = Unpooled.buffer();
      var2.writeByte(255);
      char[] var3 = var1.toCharArray();
      var2.writeShort(var3.length);

      for(char var7 : var3) {
         var2.writeChar(var7);
      }

      return var2;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
