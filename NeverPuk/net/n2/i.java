package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import net.n2.a;
import net.n2.h;
import net.n2.k;
import net.n2.t;
import net.n2.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class i extends ByteToMessageDecoder {
   private static final Logger p = LogManager.getLogger();
   private static final Marker I = MarkerManager.getMarker("PACKET_RECEIVED", a.c);
   private final w H;

   public i(w var1) {
      this.H = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) throws Exception {
      int var4 = h.X();
      if(var2.readableBytes() != 0) {
         h var5 = new h(var2);
         int var6 = var5.q();
         k var7 = ((t)var1.channel().attr(a.h).get()).T(this.H, var6);
         if(var7 == null) {
            throw new IOException("Bad packet id " + var6);
         }

         var7.E(var5);
         if(var5.readableBytes() > 0) {
            throw new IOException("Packet " + ((t)var1.channel().attr(a.h).get()).M() + "/" + var6 + " (" + var7.getClass().getSimpleName() + ") was larger than I expected, found " + var5.readableBytes() + " bytes extra whilst reading packet " + var6);
         }

         var3.add(var7);
         if(p.isDebugEnabled()) {
            p.debug(I, " IN: [{}:{}] {}", var1.channel().attr(a.h).get(), Integer.valueOf(var6), var7.getClass().getName());
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
