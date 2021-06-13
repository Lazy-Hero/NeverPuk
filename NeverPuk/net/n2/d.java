package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;
import net.n2.h;

public class d extends ByteToMessageDecoder {
   private final Inflater X;
   private int r;

   public d(int var1) {
      this.r = var1;
      this.X = new Inflater();
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) throws Exception {
      int var4 = h.w();
      if(var2.readableBytes() != 0) {
         h var5 = new h(var2);
         int var6 = var5.q();
         if(var6 == 0) {
            var3.add(var5.readBytes(var5.readableBytes()));
         }

         if(var6 < this.r) {
            throw new DecoderException("Badly compressed packet - size of " + var6 + " is below server threshold of " + this.r);
         }

         if(var6 > 2097152) {
            throw new DecoderException("Badly compressed packet - size of " + var6 + " is larger than protocol maximum of " + 2097152);
         }

         byte[] var7 = new byte[var5.readableBytes()];
         var5.readBytes(var7);
         this.X.setInput(var7);
         byte[] var8 = new byte[var6];
         this.X.inflate(var8);
         var3.add(Unpooled.wrappedBuffer(var8));
         this.X.reset();
      }

   }

   public void q(int var1) {
      this.r = var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
