package net.nd;

import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.nd.c;
import net.nd.x;
import net.nn.j;
import net.y.u1;
import net.z.t;

public class h extends net.z.g {
   private final j b;
   private final h.m[] H = new h.m[5];
   private final Deque Z = Queues.newArrayDeque();

   public h(j var1) {
      this.b = var1;
   }

   public void T(t var1) {
      if(!this.b.T.h) {
         u1.m();

         for(int var2 = 0; var2 < this.H.length; ++var2) {
            h.m var3 = this.H[var2];
            if(var3.p(var1.u(), var2)) {
               this.H[var2] = null;
            }

            if(this.H[var2] == null && !this.Z.isEmpty()) {
               this.H[var2] = new h.m((c)this.Z.removeFirst());
            }
         }
      }

   }

   @Nullable
   public c m(Class var1, Object var2) {
      x.d.c();
      h.m[] var4 = this.H;
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         h.m var7 = var4[var6];
         if(var1.isAssignableFrom(var7.n().getClass()) && var7.n().w().equals(var2)) {
            return var7.n();
         }

         ++var6;
      }

      Iterator var8 = this.Z.iterator();
      if(var8.hasNext()) {
         c var9 = (c)var8.next();
         if(var1.isAssignableFrom(var9.getClass()) && var9.w().equals(var2)) {
            return var9;
         }
      }

      return null;
   }

   public void T() {
      Arrays.fill(this.H, (Object)null);
      this.Z.clear();
   }

   public void a(c var1) {
      this.Z.add(var1);
   }

   public j Q() {
      return this.b;
   }

   private static xn b(xn var0) {
      return var0;
   }

   class m {
      private final c v;
      private long E;
      private long G;
      private c.d C;

      private m(c var2) {
         this.E = -1L;
         this.G = -1L;
         this.C = c.d.SHOW;
         this.v = var2;
      }

      public c n() {
         return this.v;
      }

      private float v(long var1) {
         float var3 = net.u.t.T((float)(var1 - this.E) / 600.0F, 0.0F, 1.0F);
         var3 = var3 * var3;
         return this.C == c.d.HIDE?1.0F - var3:var3;
      }

      public boolean p(int var1, int var2) {
         x.d.c();
         long var4 = j.E();
         if(this.E == -1L) {
            this.E = var4;
            this.C.p(h.this.b.n());
         }

         if(this.C == c.d.SHOW && Long.compare(var4 - this.E, 600L) <= 0) {
            this.G = var4;
         }

         net.y.d.c();
         net.y.d.O((float)var1 - 160.0F * this.v(var4), (float)(var2 * 32), (float)(500 + var2));
         c.d var6 = this.v.n(h.this, var4 - this.G);
         net.y.d.Y();
         if(var6 != this.C) {
            this.E = var4 - (long)((int)((1.0F - this.v(var4)) * 600.0F));
            this.C = var6;
            this.C.p(h.this.b.n());
         }

         boolean var10000 = this.C == c.d.HIDE && Long.compare(var4 - this.E, 600L) > 0;
         net.u.d.h(new net.u.d[4]);
         return var10000;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
