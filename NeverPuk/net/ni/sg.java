package net.ni;

import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.ni.w;

public class sg extends v {
   public final net.cb.t[] k = new net.cb.t[]{new net.cb.l(""), new net.cb.l(""), new net.cb.l(""), new net.cb.l("")};
   public int c = -1;
   private boolean R = true;
   private net.r.r g;
   private final net.nv.l z = new net.nv.l();

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      int var2 = 0;

      while(true) {
         String var3 = net.cb.t.m(this.k[var2]);
         var1.b("Text" + (var2 + 1), var3);
         ++var2;
      }
   }

   protected void Y(net.yv.r var1) {
      this.k(var1);
   }

   public void G(net.nj.f var1) {
      this.R = false;
      super.G(var1);
      net.nv.f var2 = new net.nv.f() {
         public String Q() {
            return "Sign";
         }

         public boolean n(int var1, String var2) {
            return true;
         }

         public net.u.j z() {
            return sg.this.S;
         }

         public net.u.r A() {
            return new net.u.r((double)sg.this.S.t() + 0.5D, (double)sg.this.S.h() + 0.5D, (double)sg.this.S.y() + 0.5D);
         }

         public net.yv.r T() {
            return sg.this.J;
         }

         public net.nx.f E() {
            return sg.this.J.v();
         }
      };
      int var3 = 0;

      while(true) {
         String var4 = var1.J("Text" + (var3 + 1));
         net.cb.t var5 = net.cb.t.m(var4);
         this.k[var3] = net.cb.y.x(var2, var5, (net.ne.l)null);
         ++var3;
      }
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 9, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public boolean u() {
      return true;
   }

   public boolean c() {
      return this.R;
   }

   public void p(boolean var1) {
      this.R = var1;
      this.g = null;
   }

   public void M(net.r.r var1) {
      this.g = var1;
   }

   public net.r.r Z() {
      return this.g;
   }

   public boolean a(final net.r.r var1) {
      net.nv.f var3 = new net.nv.f() {
         public String Q() {
            return var1.Q();
         }

         public net.cb.t b() {
            return var1.b();
         }

         public void r(net.cb.t var1x) {
         }

         public boolean n(int var1x, String var2) {
            int[] var3 = w.C();
            return var1x <= 2;
         }

         public net.u.j z() {
            return sg.this.S;
         }

         public net.u.r A() {
            return new net.u.r((double)sg.this.S.t() + 0.5D, (double)sg.this.S.h() + 0.5D, (double)sg.this.S.y() + 0.5D);
         }

         public net.yv.r T() {
            return var1.T();
         }

         public net.ne.l P() {
            return var1;
         }

         public boolean x() {
            return false;
         }

         public void n(net.nv.l var1x, int var2) {
            int[] var3 = w.C();
            if(sg.this.J != null && !sg.this.J.x) {
               sg.this.z.b(sg.this.J.v(), this, var1x, var2);
            }

         }

         public net.nx.f E() {
            return var1.E();
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      w.C();
      net.cb.t[] var4 = this.k;
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         net.cb.t var7 = var4[var6];
         net.cb.f var8 = var7 == null?null:var7.E();
         if(var8.T() != null) {
            net.n6.k var9 = var8.T();
            if(var9.J() == net.n6.k.RUN_COMMAND) {
               var1.E().f().L(var3, var9.q());
            }
         }

         ++var6;
      }

      return true;
   }

   public net.nv.l F() {
      return this.z;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
