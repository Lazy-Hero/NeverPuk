package net.q;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.c9.i;
import net.c9.pz;
import net.cr.s;
import net.m.qp;
import net.n0.ks;
import net.nl.ze;
import net.nn.j;
import net.q.a;
import net.q.h;
import net.q.k;
import net.q.l;
import net.q.o;
import net.v.c;
import net.y.u1;
import net.yf.b;
import net.yf.n;
import net.ys.r;
import net.yz.m_;
import net.z.g;
import net.z.te;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class d extends g implements k {
   protected static final m_ y = new m_("textures/gui/recipe_book.png");
   private int O;
   private int n;
   private int P;
   private final l p = new l();
   private final List K = Lists.newArrayList(new h[]{new h(0, r.B), new h(0, r.y), new h(0, r.M), new h(0, r.K), new h(0, r.i)});
   private h B;
   private te c;
   private ze j;
   private j E;
   private wd o;
   private String Z = "";
   private c V;
   private final a m = new a();
   private final net.yf.p L = new net.yf.p();
   private int i;

   public void M(int var1, int var2, j var3, boolean var4, ze var5) {
      this.E = var3;
      this.n = var1;
      this.P = var2;
      this.j = var5;
      this.V = var3.sf.m();
      this.i = var3.sf.a8.s();
      this.B = (h)this.K.get(0);
      this.B.Q(true);
      if(this.W()) {
         this.e(var4, var5);
      }

      Keyboard.enableRepeatEvents(true);
   }

   public void e(boolean var1, ze var2) {
      this.O = 0;
      int var3 = (this.n - 147) / 2 - this.O;
      int var4 = (this.P - 166) / 2;
      this.L.L();
      this.E.sf.a8.Q(this.L, false);
      var2.G(this.L);
      this.o = new wd(0, this.E.sO, var3 + 25, var4 + 14, 80, this.E.sO.R + 5);
      this.o.r(50);
      this.o.S(false);
      this.o.l(true);
      this.o.b(16777215);
      this.m.c(this.E, var3, var4);
      this.m.Y(this);
      this.c = new te(0, var3 + 110, var4 + 12, 26, 16, this.V.x());
      this.c.G(152, 41, 28, 18, y);
      this.x(false);
      this.t();
   }

   public void B() {
      Keyboard.enableRepeatEvents(false);
   }

   public int f(boolean var1, int var2, int var3) {
      int var4;
      if(this.W()) {
         var4 = 177 + (var2 - var3 - 200) / 2;
      } else {
         var4 = (var2 - var3) / 2;
      }

      return var4;
   }

   public void W() {
      this.O(!this.W());
   }

   public boolean W() {
      return this.V.B();
   }

   private void O(boolean var1) {
      this.V.v(var1);
      this.m.l();
      this.J();
   }

   public void v(@Nullable net.nl.o var1) {
      if(var1.d <= 9) {
         this.p.d();
         if(this.W()) {
            this.F();
         }
      }

   }

   private void x(boolean var1) {
      List var2 = (List)n.Q.get(this.B.d());
      var2.forEach((var1) -> {
         var1.P(this.L, this.j.Q(), this.j.X(), this.V);
      });
      ArrayList var3 = Lists.newArrayList(var2);
      var3.removeIf((var0) -> {
         return !var0.b();
      });
      var3.removeIf((var0) -> {
         return !var0.v();
      });
      String var4 = this.o.u();
      if(!var4.isEmpty()) {
         ObjectLinkedOpenHashSet var5 = new ObjectLinkedOpenHashSet(this.E.T(b.e).z(var4.toLowerCase(Locale.ROOT)));
         var3.removeIf((var1) -> {
            return !var5.contains(var1);
         });
      }

      if(this.V.x()) {
         var3.removeIf((var0) -> {
            return !var0.T();
         });
      }

      this.m.Q(var3, var1);
   }

   private void t() {
      int var1 = (this.n - 147) / 2 - this.O - 30;
      int var2 = (this.P - 166) / 2 + 3;
      boolean var10000 = true;
      int var4 = 0;

      for(h var6 : this.K) {
         r var7 = var6.d();
         if(var7 == r.B) {
            var6.F = true;
            var6.Y(var1, var2 + 27 * var4++);
         } else if(var6.O()) {
            var6.Y(var1, var2 + 27 * var4++);
            var6.e(this.E);
         }
      }

   }

   public void X() {
      if(this.W() && this.i != this.E.sf.a8.s()) {
         this.F();
         this.i = this.E.sf.a8.s();
      }

   }

   private void F() {
      this.L.L();
      this.E.sf.a8.Q(this.L, false);
      this.j.G(this.L);
      this.x(false);
   }

   public void N(int var1, int var2, float var3) {
      if(this.W()) {
         u1.A();
         net.y.d.i();
         net.y.d.c();
         net.y.d.O(0.0F, 0.0F, 100.0F);
         this.E.n().E(y);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         int var4 = (this.n - 147) / 2 - this.O;
         int var5 = (this.P - 166) / 2;
         this.g(var4, var5, 1, 1, 147, 166);
         this.o.Z();
         u1.m();

         for(h var7 : this.K) {
            var7.Z(this.E, var1, var2, var3);
         }

         this.c.Z(this.E, var1, var2, var3);
         this.m.R(var4, var5, var1, var2, var3);
         net.y.d.Y();
      }

   }

   public void G(int var1, int var2, int var3, int var4) {
      if(this.W()) {
         this.m.o(var3, var4);
         if(this.c.Z()) {
            String var5 = net.c9.b.x(this.c.o()?"gui.recipebook.toggleRecipes.craftable":"gui.recipebook.toggleRecipes.all", new Object[0]);
            if(this.E.s5 != null) {
               this.E.s5.B(var5, var3, var4);
            }
         }

         this.Q(var1, var2, var3, var4);
      }

   }

   private void Q(int var1, int var2, int var3, int var4) {
      ks var5 = null;

      for(int var6 = 0; var6 < this.p.u(); ++var6) {
         l.d var7 = this.p.o(var6);
         int var8 = var7.m() + var1;
         int var9 = var7.N() + var2;
         if(var3 >= var8 && var4 >= var9 && var3 < var8 + 16 && var4 < var9 + 16) {
            var5 = var7.L();
         }
      }

      if(this.E.s5 != null) {
         this.E.s5.U(this.E.s5.z(var5), var3, var4);
      }

   }

   public void q(int var1, int var2, boolean var3, float var4) {
      this.p.H(this.E, var1, var2, var3, var4);
   }

   public boolean t(int var1, int var2, int var3) {
      String[] var4 = o.r();
      if(this.W() && !this.E.sf.VX()) {
         if(this.m.Q(var1, var2, var3, (this.n - 147) / 2 - this.O, (this.P - 166) / 2, 147, 166)) {
            s var8 = this.m.j();
            o var9 = this.m.j();
            if(var9 != null) {
               if(!var9.A(var8) && this.p.W() == var8) {
                  return false;
               }

               this.p.d();
               this.E.sE.g(this.E.sf.aG.S, var8, tu.s(), this.E.sf);
               if(!this.l() && var3 == 0) {
                  this.O(false);
               }
            }

            return true;
         } else if(var3 != 0) {
            return false;
         } else if(this.o.N(var1, var2, var3)) {
            return true;
         } else if(this.c.X(this.E, var1, var2)) {
            boolean var7 = !this.V.x();
            this.V.U(var7);
            this.c.Q(var7);
            this.c.i(this.E.n());
            this.J();
            this.x(false);
            return true;
         } else {
            Iterator var5 = this.K.iterator();
            if(var5.hasNext()) {
               h var6 = (h)var5.next();
               if(var6.X(this.E, var1, var2)) {
                  if(this.B != var6) {
                     var6.i(this.E.n());
                     this.B.Q(false);
                     this.B = var6;
                     this.B.Q(true);
                     this.x(true);
                  }

                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public boolean l(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(!this.W()) {
         return true;
      } else {
         if(var1 >= var3 && var2 >= var4 && var1 < var3 + var5 && var2 < var4 + var6) {
            boolean var9 = false;
         } else {
            boolean var10000 = true;
         }

         if(var3 - 147 < var1 && var1 < var3 && var4 < var2 && var2 < var4 + var6) {
            boolean var11 = true;
         } else {
            boolean var10 = false;
         }

         return !this.B.X(this.E, var1, var2);
      }
   }

   public boolean o(char var1, int var2) {
      if(this.W() && !this.E.sf.VX()) {
         if(var2 == 1 && !this.l()) {
            this.O(false);
            return true;
         } else {
            if(net.nr.d.C(this.E.T.wg) && !this.o.Y()) {
               this.o.n(true);
            } else if(this.o.l(var1, var2)) {
               String var3 = this.o.u().toLowerCase(Locale.ROOT);
               this.E(var3);
               if(!var3.equals(this.Z)) {
                  this.x(false);
                  this.Z = var3;
               }

               return true;
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private void E(String var1) {
      if("excitedze".equals(var1)) {
         i var2 = this.E.I();
         pz var3 = var2.U("en_pt");
         if(var2.D().K(var3) == 0) {
            return;
         }

         var2.X(var3);
         this.E.T.wP = var3.n();
         this.E.R();
         this.E.sO.d(this.E.I().h() || this.E.T.in);
         this.E.sO.A(var2.v());
         this.E.T.m();
      }

   }

   private boolean l() {
      return this.O == 86;
   }

   public void w() {
      this.t();
      if(this.W()) {
         this.x(false);
      }

   }

   public void a(List var1) {
      for(s var3 : var1) {
         this.E.sf.l(var3);
      }

   }

   public void g(s var1, List var2) {
      ks var3 = var1.E();
      this.p.P(var1);
      this.p.u(net.cr.l.b(new ks[]{var3}), ((net.nl.o)var2.get(0)).Y, ((net.nl.o)var2.get(0)).S);
      int var4 = this.j.Q();
      int var5 = this.j.X();
      int var6 = var1 instanceof net.cr.j?((net.cr.j)var1).M():var4;
      int var7 = 1;
      Iterator var8 = var1.p().iterator();

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            if(!var8.hasNext()) {
               return;
            }

            net.cr.l var11 = (net.cr.l)var8.next();
            if(var11 != net.cr.l.r) {
               net.nl.o var12 = (net.nl.o)var2.get(var7);
               this.p.u(var11, var12.Y, var12.S);
            }

            ++var7;
         }

         if(var6 < var4) {
            var7 += var4 - var6;
         }
      }

   }

   private void J() {
      if(this.E.d() != null) {
         this.E.d().L((net.n2.k)(new qp(this.W(), this.V.x())));
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
