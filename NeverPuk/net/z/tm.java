package net.z;

import java.io.IOException;
import net.xn;
import net.n0.ks;
import net.y.u1;
import net.z.g;
import net.z.h;
import net.z.m;
import net.z.t1;
import net.z.t2;
import net.z.tu;

public class tm extends tu {
   private final t1 r;
   private net.cn.a l = net.cn.a.G();
   private String Y;
   private String u;
   private String y;
   private tm.c s;
   private m K;
   private m p;
   private m n;

   public tm(t1 var1, String var2) {
      this.r = var1;
      this.Z(var2);
   }

   public String E() {
      return this.l.toString();
   }

   public void Z(String var1) {
      this.l = net.cn.a.n(var1);
   }

   public void L() {
      this.m.clear();
      this.Y = net.c9.b.x("createWorld.customize.flat.title", new Object[0]);
      this.u = net.c9.b.x("createWorld.customize.flat.tile", new Object[0]);
      this.y = net.c9.b.x("createWorld.customize.flat.height", new Object[0]);
      this.s = new tm.c();
      this.K = this.x(new m(2, q / 2 - 154, V - 52, 100, 20, net.c9.b.x("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
      this.p = this.x(new m(3, q / 2 - 50, V - 52, 100, 20, net.c9.b.x("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
      this.n = this.x(new m(4, q / 2 - 155, V - 52, 150, 20, net.c9.b.x("createWorld.customize.flat.removeLayer", new Object[0])));
      this.m.add(new m(0, q / 2 - 155, V - 28, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      this.m.add(new m(5, q / 2 + 5, V - 52, 150, 20, net.c9.b.x("createWorld.customize.presets", new Object[0])));
      this.m.add(new m(1, q / 2 + 5, V - 28, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.K.F = false;
      this.p.F = false;
      this.l.l();
      this.s();
   }

   public void m() throws IOException {
      super.m();
      this.s.q();
   }

   protected void t(m var1) throws IOException {
      g.B();
      int var3 = this.l.N().size() - this.s.I - 1;
      if(var1.g == 1) {
         this.A.s(this.r);
      }

      if(var1.g == 0) {
         this.r.U = this.E();
         this.A.s(this.r);
      }

      if(var1.g == 5) {
         this.A.s(new t2(this));
      }

      if(var1.g == 4 && this.r()) {
         this.l.N().remove(var3);
         this.s.I = Math.min(this.s.I, this.l.N().size() - 1);
      }

      this.l.l();
      this.s();
   }

   public void s() {
      boolean var1 = this.r();
      this.n.O = var1;
      this.p.O = var1;
      this.p.O = false;
      this.K.O = false;
   }

   private boolean r() {
      return this.s.I > -1 && this.s.I < this.l.N().size();
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.s.Z(var1, var2, var3);
      this.d(this.O, this.Y, q / 2, 8, 16777215);
      int var4 = q / 2 - 92 - 16;
      this.n(this.O, this.u, var4, 32, 16777215);
      this.n(this.O, this.y, var4 + 2 + 213 - this.O.r(this.y), 32, 16777215);
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class c extends h {
      public int I = -1;

      public c() {
         super(tm.this.A, tu.q, tu.V, 43, tu.V - 60, 24);
      }

      private void G(int var1, int var2, ks var3) {
         this.X(var1 + 1, var2 + 1);
         net.y.d.F();
         if(!var3.B()) {
            u1.A();
            tm.this.t.i(var3, var1 + 2, var2 + 2);
            u1.m();
         }

         net.y.d.g();
      }

      private void X(int var1, int var2) {
         this.N(var1, var2, 0, 0);
      }

      private void N(int var1, int var2, int var3, int var4) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.s.n().E(g.G);
         float var10000 = 0.0078125F;
         var10000 = 0.0078125F;
         boolean var12 = true;
         var12 = true;
         net.y.r var9 = net.y.r.f();
         net.y.p var10 = var9.k();
         var10.m(7, net.y8.x.H);
         var10.H((double)(var1 + 0), (double)(var2 + 18), (double)g.d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
         var10.H((double)(var1 + 18), (double)(var2 + 18), (double)g.d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
         var10.H((double)(var1 + 18), (double)(var2 + 0), (double)g.d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
         var10.H((double)(var1 + 0), (double)(var2 + 0), (double)g.d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
         var9.p();
      }

      protected int V() {
         return tm.this.l.N().size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
         this.I = var1;
         tm.this.s();
      }

      protected boolean z(int var1) {
         return var1 == this.I;
      }

      protected void x() {
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         net.cn.p var9 = (net.cn.p)tm.this.l.N().get(tm.this.l.N().size() - var1 - 1);
         g.C();
         net.yw.n var10 = var9.N();
         net.y9.l var11 = var10.Q();
         net.n0.y var12 = net.n0.y.q(var11);
         if(var12 == net.nb.j.SL) {
            label75: {
               if(var11 != net.nb.f.uM && var11 != net.nb.f.dy) {
                  if(var11 != net.nb.f.TL && var11 != net.nb.f.dj) {
                     break label75;
                  }

                  var12 = net.nb.j.T;
               }

               var12 = net.nb.j.Wb;
            }
         }

         ks var13 = new ks(var12, 1, var12.I()?var11.d(var10):0);
         String var14 = var12.m(var13);
         this.G(var2, var3, var13);
         tm.this.O.v(var14, (float)(var2 + 18 + 5), (float)(var3 + 3), 16777215);
         if(var1 == 0) {
            String var15 = net.c9.b.x("createWorld.customize.flat.layer.top", new Object[]{Integer.valueOf(var9.Q())});
         }

         if(var1 == tm.this.l.N().size() - 1) {
            String var17 = net.c9.b.x("createWorld.customize.flat.layer.bottom", new Object[]{Integer.valueOf(var9.Q())});
         }

         String var18 = net.c9.b.x("createWorld.customize.flat.layer", new Object[]{Integer.valueOf(var9.Q())});
         tm.this.O.v(var18, (float)(var2 + 2 + 213 - tm.this.O.r(var18)), (float)(var3 + 3), 16777215);
      }

      protected int I() {
         return this.x - 70;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
