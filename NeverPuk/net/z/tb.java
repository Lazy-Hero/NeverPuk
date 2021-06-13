package net.z;

import java.io.IOException;
import net.xn;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tu;

public class tb extends tu {
   private final tu s;
   private final net.nr.d Q;
   protected String U = "Options";
   private String Z;

   public tb(tu var1, net.nr.d var2) {
      this.s = var1;
      this.Q = var2;
   }

   public void L() {
      g.C();
      this.U = net.c9.b.x("options.sounds.title", new Object[0]);
      this.Z = net.c9.b.x("options.off", new Object[0]);
      int var2 = 0;
      this.m.add(new tb.r(net.yz.p.MASTER.ordinal(), q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), net.yz.p.MASTER, true));
      var2 = var2 + 2;
      net.yz.p[] var3 = net.yz.p.values();
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.yz.p var6 = var3[var5];
         if(var6 != net.yz.p.MASTER) {
            this.m.add(new tb.r(var6.ordinal(), q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), var6, false));
            ++var2;
         }

         ++var5;
      }

      int var9 = q / 2 - 75;
      var4 = V / 6 - 12;
      ++var2;
      this.m.add(new th(201, var9, var4 + 24 * (var2 >> 1), net.nr.d.SHOW_SUBTITLES, this.Q.L(net.nr.d.SHOW_SUBTITLES)));
      this.m.add(new m(200, q / 2 - 100, V / 6 + 168, net.c9.b.x("gui.done", new Object[0])));
   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.A.T.m();
      }

      super.Q(var1, var2);
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      if(var1.O) {
         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.s);
         }

         if(var1.g == 201) {
            this.A.T.T(net.nr.d.SHOW_SUBTITLES, 1);
            var1.J = this.A.T.L(net.nr.d.SHOW_SUBTITLES);
            this.A.T.m();
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.U, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
   }

   protected String T(net.yz.p var1) {
      float var2 = this.Q.b(var1);
      return var2 == 0.0F?this.Z:(int)(var2 * 100.0F) + "%";
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class r extends m {
      private final net.yz.p C;
      private final String u;
      public float H = 1.0F;
      public boolean W;

      public r(int var2, int var3, int var4, net.yz.p var5, boolean var6) {
         super(var2, var3, var4, 310, 20, "");
         this.C = var5;
         this.u = net.c9.b.x("soundCategory." + var5.W(), new Object[0]);
         this.J = this.u + ": " + tb.this.T(var5);
         this.H = tb.this.Q.b(var5);
      }

      protected int O(boolean var1) {
         return 0;
      }

      protected void N(net.nn.j var1, int var2, int var3) {
         boolean var4 = g.B();
         if(this.F) {
            if(this.W) {
               this.H = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
               this.H = net.u.t.T(this.H, 0.0F, 1.0F);
               var1.T.r(this.C, this.H);
               var1.T.m();
               this.J = this.u + ": " + tb.this.T(this.C);
            }

            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            this.g(this.D + (int)(this.H * (float)(this.s - 8)), this.R, 0, 66, 4, 20);
            this.g(this.D + (int)(this.H * (float)(this.s - 8)) + 4, this.R, 196, 66, 4, 20);
         }

      }

      public boolean X(net.nn.j var1, int var2, int var3) {
         boolean var4 = g.B();
         if(super.X(var1, var2, var3)) {
            this.H = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
            this.H = net.u.t.T(this.H, 0.0F, 1.0F);
            var1.T.r(this.C, this.H);
            var1.T.m();
            this.J = this.u + ": " + tb.this.T(this.C);
            this.W = true;
            return true;
         } else {
            return false;
         }
      }

      public void i(net.h.m var1) {
      }

      public void A(int var1, int var2) {
         if(this.W) {
            tb.this.A.n().g((net.h.d)net.h.a.v(net.nb.l.Ku, 1.0F));
         }

         this.W = false;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
