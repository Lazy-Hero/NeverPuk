package net.q;

import java.util.List;
import net.xn;
import net.c9.b;
import net.cr.s;
import net.n0.ks;
import net.nn.j;
import net.q.a;
import net.q.o;
import net.u.t;
import net.v.c;
import net.y.u1;
import net.yz.m_;
import net.z.tu;

public class y extends net.z.m {
   private static final m_ i = new m_("textures/gui/recipe_book.png");
   private c y;
   private o X;
   private float I;
   private float K;
   private int q;

   public y() {
      super(0, 0, 0, 25, 25, "");
   }

   public void u(o var1, a var2, c var3) {
      this.X = var1;
      this.y = var3;
      List var4 = var1.T(var3.x());

      for(s var6 : var4) {
         if(var3.s(var6)) {
            var2.G(var4);
            this.K = 15.0F;
            break;
         }
      }

   }

   public o d() {
      return this.X;
   }

   public void x(int var1, int var2) {
      this.D = var1;
      this.R = var2;
   }

   public void Z(j var1, int var2, int var3, float var4) {
      String[] var5 = o.r();
      if(this.F) {
         if(!tu.T()) {
            this.I += var4;
         }

         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         u1.A();
         var1.n().E(i);
         net.y.d.i();
         int var6 = 29;
         if(!this.X.T()) {
            var6 += 25;
         }

         int var7 = 206;
         if(this.X.T(this.y.x()).size() > 1) {
            var7 += 25;
         }

         boolean var8 = Float.compare(this.K, 0.0F) > 0;
         float var9 = 1.0F + 0.1F * (float)Math.sin((double)(this.K / 15.0F * 3.1415927F));
         net.y.d.c();
         net.y.d.O((float)(this.D + 8), (float)(this.R + 12), 0.0F);
         net.y.d.W(var9, var9, 1.0F);
         net.y.d.O((float)(-(this.D + 8)), (float)(-(this.R + 12)), 0.0F);
         this.K -= var4;
         this.g(this.D, this.R, var6, var7, this.s, this.h);
         List var12 = this.S();
         this.q = t.M(this.I / 30.0F) % var12.size();
         ks var10 = ((s)var12.get(this.q)).E();
         int var11 = 4;
         if(this.X.p() && this.S().size() > 1) {
            var1.K().M(var10, this.D + var11 + 1, this.R + var11 + 1);
            --var11;
         }

         var1.K().M(var10, this.D + var11, this.R + var11);
         net.y.d.K();
         u1.m();
      }

   }

   private List S() {
      List var1 = this.X.y(true);
      if(!this.y.x()) {
         var1.addAll(this.X.y(false));
      }

      return var1;
   }

   public boolean G() {
      return this.S().size() == 1;
   }

   public s T() {
      List var1 = this.S();
      return (s)var1.get(this.q);
   }

   public List I(tu var1) {
      ks var2 = ((s)this.S().get(this.q)).E();
      List var3 = var1.z(var2);
      if(this.X.T(this.y.x()).size() > 1) {
         var3.add(b.x("gui.recipebook.moreRecipes", new Object[0]));
      }

      return var3;
   }

   public int h() {
      return 25;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
