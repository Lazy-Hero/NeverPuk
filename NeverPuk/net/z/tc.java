package net.z;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.xn;
import net.c9.pz;
import net.z.g;
import net.z.h;
import net.z.m;
import net.z.t;
import net.z.th;
import net.z.tu;

public class tc extends tu {
   protected tu U;
   private tc.j w;
   private final net.nr.d Q;
   private final net.c9.i T;
   private th F;
   private th f;

   public tc(tu var1, net.nr.d var2, net.c9.i var3) {
      this.U = var1;
      this.Q = var2;
      this.T = var3;
   }

   public void L() {
      this.F = (th)this.x(new th(100, q / 2 - 155, V - 38, net.nr.d.FORCE_UNICODE_FONT, this.Q.L(net.nr.d.FORCE_UNICODE_FONT)));
      this.f = (th)this.x(new th(6, q / 2 - 155 + 160, V - 38, net.c9.b.x("gui.done", new Object[0])));
      this.w = new tc.j(this.A);
      this.w.A(7, 8);
   }

   public void m() throws IOException {
      super.m();
      this.w.q();
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.C();
      if(var1.O) {
         switch(var1.g) {
         case 5:
         case 6:
            this.A.s(this.U);
         case 100:
            if(!(var1 instanceof th)) {
               break;
            }

            this.Q.T(((th)var1).P(), 1);
            var1.J = this.Q.L(net.nr.d.FORCE_UNICODE_FONT);
            t var3 = new t(this.A);
            int var4 = var3.u();
            int var5 = var3.v();
            this.b(this.A, var4, var5);
         default:
            this.w.L(var1);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.w.Z(var1, var2, var3);
      this.d(this.O, net.c9.b.x("options.language", new Object[0]), q / 2, 16, 16777215);
      this.d(this.O, "(" + net.c9.b.x("options.languageWarning", new Object[0]) + ")", q / 2, V - 56, 8421504);
      super.v(var1, var2, var3);
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   class j extends h {
      private final List i;
      private final Map h;

      public j(net.nn.j var2) {
         g.C();
         super(var2, tu.q, tu.V, 32, tu.V - 65 + 4, 18);
         this.i = Lists.newArrayList();
         this.h = Maps.newHashMap();
         Iterator var4 = tc.this.T.i().iterator();
         if(var4.hasNext()) {
            pz var5 = (pz)var4.next();
            this.h.put(var5.n(), var5);
            this.i.add(var5.n());
         }

      }

      protected int V() {
         return this.i.size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
         g.B();
         pz var6 = (pz)this.h.get(this.i.get(var1));
         tc.this.T.X(var6);
         tc.this.Q.wP = var6.n();
         this.s.R();
         tc.this.O.d(tc.this.T.h() || tc.this.Q.in);
         tc.this.O.A(tc.this.T.v());
         tc.this.f.J = net.c9.b.x("gui.done", new Object[0]);
         tc.this.F.J = tc.this.Q.L(net.nr.d.FORCE_UNICODE_FONT);
         tc.this.Q.m();
      }

      protected boolean z(int var1) {
         return ((String)this.i.get(var1)).equals(tc.this.T.D().n());
      }

      protected int X() {
         return this.V() * 18;
      }

      protected void x() {
         tc.this.C();
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         tc.this.O.A(true);
         tc.this.d(tc.this.O, ((pz)this.h.get(this.i.get(var1))).toString(), this.x / 2, var3 + 1, 16777215);
         tc.this.O.A(tc.this.T.D().V());
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
