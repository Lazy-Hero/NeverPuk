package net.y2;

import com.google.common.collect.Maps;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import net.c9.p;
import net.c9.q;
import net.y.ui;
import net.y2.m;
import net.y2.t;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class r {
   private final r.u I;
   private final String L;
   private final int l;
   private int S;

   private r(r.u var1, int var2, String var3) {
      this.I = var1;
      this.l = var2;
      this.L = var3;
   }

   public void r(m var1) {
      ++this.S;
      ui.K(var1.z(), this.l);
   }

   public void A(m var1) {
      t.h();
      --this.S;
      if(this.S <= 0) {
         ui.I(this.l);
         this.I.B().remove(this.L);
      }

   }

   public String c() {
      return this.L;
   }

   public static r I(p var0, r.u var1, String var2) throws IOException {
      t.h();
      r var4 = (r)var1.B().get(var2);
      if(var4 == null) {
         m_ var5 = new m_("shaders/program/" + var2 + var1.o());
         q var6 = var0.A(var5);
         byte[] var7 = IOUtils.toByteArray(new BufferedInputStream(var6.k()));
         ByteBuffer var8 = BufferUtils.createByteBuffer(var7.length);
         var8.put(var7);
         var8.position(0);
         int var9 = ui.T(var1.f());
         ui.a(var9, var8);
         ui.k(var9);
         if(ui.u(var9, ui.X) == 0) {
            String var10 = StringUtils.trim(ui.h(var9, '耀'));
            net.yf.a var11 = new net.yf.a("Couldn\'t compile " + var1.e() + " program: " + var10);
            var11.e(var5.v());
            throw var11;
         }

         var4 = new r(var1, var9, var2);
         var1.B().put(var2, var4);
         IOUtils.closeQuietly(var6);
      }

      return var4;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum u {
      VERTEX("vertex", ".vsh", ui.q3),
      FRAGMENT("fragment", ".fsh", ui.l);

      private final String B;
      private final String y;
      private final int R;
      private final Map z = Maps.newHashMap();

      private u(String var3, String var4, int var5) {
         this.B = var3;
         this.y = var4;
         this.R = var5;
      }

      public String e() {
         return this.B;
      }

      private String o() {
         return this.y;
      }

      private int f() {
         return this.R;
      }

      private Map B() {
         return this.z;
      }
   }
}
