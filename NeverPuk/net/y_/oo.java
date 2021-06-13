package net.y_;

import java.util.Iterator;
import net.xn;
import net.y_.b;
import net.y_.ou;

public class oo extends ou {
   private final boolean s;
   private int z;
   private final Class[] C;

   public oo(net.ne.s var1, boolean var2, Class... var3) {
      super(var1, true);
      this.s = var2;
      this.C = var3;
      this.h(1);
   }

   public boolean f() {
      int var1 = this.k.h();
      net.ne.a var2 = this.k.X();
      return var1 != this.z && this.h(var2, false);
   }

   public void I() {
      this.k.C(this.k.X());
      this.E = this.k.M();
      this.z = this.k.h();
      this.I = 300;
      if(this.s) {
         this.a();
      }

      super.I();
   }

   protected void a() {
      b.q();
      double var2 = this.h();
      Iterator var4 = this.k.hl.p(this.k.getClass(), (new net.u.e(this.k.b, this.k.hS, this.k.hr, this.k.b + 1.0D, this.k.hS + 1.0D, this.k.hr + 1.0D)).f(var2, 10.0D, var2)).iterator();
      if(var4.hasNext()) {
         net.ne.s var5 = (net.ne.s)var4.next();
         if(this.k != var5 && var5.M() == null && (!(this.k instanceof net.yn.d) || ((net.yn.d)this.k).L() == ((net.yn.d)var5).L()) && !var5.M(this.k.X())) {
            boolean var6 = false;
            Class[] var7 = this.C;
            int var8 = var7.length;
            int var9 = 0;
            if(var9 < var8) {
               Class var10 = var7[var9];
               if(var5.getClass() == var10) {
                  var6 = true;
               }

               ++var9;
            }

            this.A(var5, this.k.X());
         }
      }

   }

   protected void A(net.ne.s var1, net.ne.a var2) {
      var1.C(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
