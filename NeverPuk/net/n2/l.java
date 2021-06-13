package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import net.n2.a;
import net.n2.h;
import net.n2.k;
import net.n2.t;
import net.n2.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class l extends MessageToByteEncoder {
   private static final Logger z = LogManager.getLogger();
   private static final Marker t = MarkerManager.getMarker("PACKET_SENT", a.c);
   private final w h;

   public l(w var1) {
      this.h = var1;
   }

   protected void q(ChannelHandlerContext var1, k var2, ByteBuf var3) throws Exception {
      h.w();
      t var5 = (t)var1.channel().attr(a.h).get();
      if(var5 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var6 = var5.K(this.h, var2);
         if(z.isDebugEnabled()) {
            z.debug(t, "OUT: [{}:{}] {}", var1.channel().attr(a.h).get(), var6, var2.getClass().getName());
         }

         throw new IOException("Can\'t serialize unregistered packet");
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
