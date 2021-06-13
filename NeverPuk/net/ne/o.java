package net.ne;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.ne.d;
import net.ne.l;
import net.ne.n;
import net.ne.y;
import net.y9.r3;
import net.yz.aq;

public class o extends n {
   public o(net.yv.r var1) {
      super(var1);
   }

   public o(net.yv.r var1, net.u.j var2) {
      super(var1, var2);
      this.t((double)var2.t() + 0.5D, (double)var2.h() + 0.5D, (double)var2.y() + 0.5D);
      float var10000 = 0.125F;
      var10000 = 0.1875F;
      var10000 = 0.25F;
      this.g(new net.u.e(this.b - 0.1875D, this.hS - 0.25D + 0.125D, this.hr - 0.1875D, this.b + 0.1875D, this.hS + 0.25D + 0.125D, this.hr + 0.1875D));
      this.hK = true;
   }

   public void t(double var1, double var3, double var5) {
      super.t((double)net.u.t.L(var1) + 0.5D, (double)net.u.t.L(var3) + 0.5D, (double)net.u.t.L(var5) + 0.5D);
   }

   protected void h() {
      this.b = (double)this.uD.t() + 0.5D;
      this.hS = (double)this.uD.h() + 0.5D;
      this.hr = (double)this.uD.y() + 0.5D;
   }

   public void b(aq var1) {
   }

   public int o() {
      return 9;
   }

   public int E() {
      return 9;
   }

   public float A() {
      return -0.0625F;
   }

   public boolean p(double var1) {
      return var1 < 1024.0D;
   }

   public void C(@Nullable l var1) {
      this.I(net.nb.l.ob, 1.0F, 1.0F);
   }

   public boolean d(net.nj.f var1) {
      return false;
   }

   public void I(net.nj.f var1) {
   }

   public void o(net.nj.f var1) {
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      boolean var3 = d.p();
      if(this.hl.x) {
         return true;
      } else {
         boolean var4 = false;
         double var10000 = 7.0D;
         List var7 = this.hl.p(y.class, new net.u.e(this.b - 7.0D, this.hS - 7.0D, this.hr - 7.0D, this.b + 7.0D, this.hS + 7.0D, this.hr + 7.0D));
         Iterator var8 = var7.iterator();
         if(var8.hasNext()) {
            y var9 = (y)var8.next();
            if(var9.ln() && var9.M() == var1) {
               var9.Y(this, true);
               var4 = true;
            }
         }

         this.B();
         if(var1.a6.V) {
            var8 = var7.iterator();
            if(var8.hasNext()) {
               y var12 = (y)var8.next();
               if(var12.ln() && var12.M() == this) {
                  var12.b(true, false);
               }
            }
         }

         return true;
      }
   }

   public boolean N() {
      return this.hl.Z(this.uD).Q() instanceof r3;
   }

   public static o Y(net.yv.r var0, net.u.j var1) {
      o var2 = new o(var0, var1);
      var0.S(var2);
      var2.a();
      return var2;
   }

   @Nullable
   public static o V(net.yv.r var0, net.u.j var1) {
      int var2 = var1.t();
      int var3 = var1.h();
      int var4 = var1.y();

      for(o var6 : var0.p(o.class, new net.u.e((double)var2 - 1.0D, (double)var3 - 1.0D, (double)var4 - 1.0D, (double)var2 + 1.0D, (double)var3 + 1.0D, (double)var4 + 1.0D))) {
         if(var6.r().equals(var1)) {
            return var6;
         }
      }

      return null;
   }

   public void a() {
      this.I(net.nb.l.wR, 1.0F, 1.0F);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
