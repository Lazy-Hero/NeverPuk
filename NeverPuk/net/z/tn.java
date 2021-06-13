package net.z;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import javax.annotation.Nullable;
import net.yz.a2;
import net.yz.a8;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class tn extends tu implements a2 {
   private wd R;
   private wd l;
   private final net.ni.q B;
   private m f;
   private m F;
   private m Y;
   private m Z;
   private m z;
   private m r;
   private boolean J;
   private net.ni.q I = net.ni.q.REDSTONE;
   private a8 Q;
   private boolean D;
   private boolean U;

   public tn(net.ni.q var1) {
      this.B = var1;
   }

   public void K() {
      this.R.K();
   }

   public void L() {
      final net.ni.w var1 = this.B.d();
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.f = this.x(new m(0, q / 2 - 4 - 150, V / 4 + 120 + 12, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      this.F = this.x(new m(1, q / 2 + 4, V / 4 + 120 + 12, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.Y = this.x(new m(4, q / 2 + 150 - 20, 135, 20, 20, "O"));
      this.Z = this.x(new m(5, q / 2 - 50 - 100 - 4, 165, 100, 20, net.c9.b.x("advMode.mode.sequence", new Object[0])));
      this.z = this.x(new m(6, q / 2 - 50, 165, 100, 20, net.c9.b.x("advMode.mode.unconditional", new Object[0])));
      this.r = this.x(new m(7, q / 2 + 50 + 4, 165, 100, 20, net.c9.b.x("advMode.mode.redstoneTriggered", new Object[0])));
      this.R = new wd(2, this.O, q / 2 - 150, 50, 300, 20);
      this.R.r(32500);
      this.R.n(true);
      this.l = new wd(3, this.O, q / 2 - 150, 135, 276, 20);
      this.l.r(32500);
      this.l.o(false);
      this.l.u("-");
      this.f.O = false;
      this.Y.O = false;
      this.Z.O = false;
      this.z.O = false;
      this.r.O = false;
      this.Q = new a8(this.R, true) {
         @Nullable
         public net.u.j D() {
            return var1.z();
         }
      };
   }

   public void H() {
      net.ni.w var1 = this.B.d();
      this.R.u(var1.v());
      this.J = var1.n();
      this.I = this.B.I();
      this.D = this.B.G();
      this.U = this.B.L();
      this.E();
      this.t();
      this.o();
      this.e();
      this.f.O = true;
      this.Y.O = true;
      this.Z.O = true;
      this.z.O = true;
      this.r.O = true;
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      if(var1.O) {
         net.ni.w var3 = this.B.d();
         if(var1.g == 1) {
            var3.f(this.J);
            this.A.s((tu)null);
         }

         if(var1.g == 0) {
            net.n2.h var4 = new net.n2.h(Unpooled.buffer());
            var3.L(var4);
            var4.R(this.R.u());
            var4.writeBoolean(var3.n());
            var4.R(this.I.name());
            var4.writeBoolean(this.D);
            var4.writeBoolean(this.U);
            this.A.d().L((net.n2.k)(new net.m.l("MC|AutoCmd", var4)));
            if(!var3.n()) {
               var3.u((net.cb.t)null);
            }

            this.A.s((tu)null);
         }

         if(var1.g == 4) {
            var3.f(!var3.n());
            this.E();
         }

         if(var1.g == 5) {
            this.U();
            this.t();
         }

         if(var1.g == 6) {
            this.D = !this.D;
            this.o();
         }

         if(var1.g == 7) {
            this.U = !this.U;
            this.e();
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      this.Q.Y();
      if(var2 == 15) {
         this.Q.g();
      } else {
         this.Q.O();
      }

      this.R.l(var1, var2);
      this.l.l(var1, var2);
      if(var2 != 28 && var2 != 156) {
         if(var2 == 1) {
            this.t(this.F);
         }
      } else {
         this.t(this.f);
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.R.N(var1, var2, var3);
      this.l.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      g.B();
      this.d(this.O, net.c9.b.x("advMode.setCommand", new Object[0]), q / 2, 20, 16777215);
      this.n(this.O, net.c9.b.x("advMode.command", new Object[0]), q / 2 - 150, 40, 10526880);
      this.R.Z();
      int var5 = 75;
      int var6 = 0;
      this.n(this.O, net.c9.b.x("advMode.nearestPlayer", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.randomPlayer", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.allPlayers", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.allEntities", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.self", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      if(!this.l.u().isEmpty()) {
         var5 = var5 + var6 * this.O.R + 1;
         this.n(this.O, net.c9.b.x("advMode.previousOutput", new Object[0]), q / 2 - 150, var5 + 4, 10526880);
         this.l.Z();
      }

      super.v(var1, var2, var3);
   }

   private void E() {
      net.ni.w var1 = this.B.d();
      if(var1.n()) {
         this.Y.J = "O";
         if(var1.D() != null) {
            this.l.u(var1.D().l());
         }
      } else {
         this.Y.J = "X";
         this.l.u("-");
      }

   }

   private void t() {
      switch(null.f[this.I.ordinal()]) {
      case 1:
         this.Z.J = net.c9.b.x("advMode.mode.sequence", new Object[0]);
         break;
      case 2:
         this.Z.J = net.c9.b.x("advMode.mode.auto", new Object[0]);
         break;
      case 3:
         this.Z.J = net.c9.b.x("advMode.mode.redstone", new Object[0]);
      }

   }

   private void U() {
      switch(null.f[this.I.ordinal()]) {
      case 1:
         this.I = net.ni.q.AUTO;
         break;
      case 2:
         this.I = net.ni.q.REDSTONE;
         break;
      case 3:
         this.I = net.ni.q.SEQUENCE;
      }

   }

   private void o() {
      if(this.D) {
         this.z.J = net.c9.b.x("advMode.mode.conditional", new Object[0]);
      } else {
         this.z.J = net.c9.b.x("advMode.mode.unconditional", new Object[0]);
      }

   }

   private void e() {
      if(this.U) {
         this.r.J = net.c9.b.x("advMode.mode.autoexec.bat", new Object[0]);
      } else {
         this.r.J = net.c9.b.x("advMode.mode.redstoneTriggered", new Object[0]);
      }

   }

   public void r(String... var1) {
      this.Q.U(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
