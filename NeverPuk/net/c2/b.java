package net.c2;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import javax.annotation.Nullable;
import net.c2.j;
import net.m.l;
import net.ni.w;
import net.yz.a2;
import net.yz.a8;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class b extends tu implements a2 {
   private wd p;
   private wd z;
   private final w I;
   private net.z.m Y;
   private net.z.m F;
   private net.z.m J;
   private boolean a;
   private a8 s;

   public b(w var1) {
      this.I = var1;
   }

   public void K() {
      this.p.K();
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      j.u.C();
      this.m.clear();
      this.Y = this.x(new net.z.m(0, q / 2 - 4 - 150, V / 4 + 120 + 12, 150, 20, net.c9.b.x("gui.done", new Object[0])));
      this.F = this.x(new net.z.m(1, q / 2 + 4, V / 4 + 120 + 12, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.J = this.x(new net.z.m(4, q / 2 + 150 - 20, 150, 20, 20, "O"));
      this.p = new wd(2, this.O, q / 2 - 150, 50, 300, 20);
      this.p.r(32500);
      this.p.n(true);
      this.p.u(this.I.v());
      this.z = new wd(3, this.O, q / 2 - 150, 150, 276, 20);
      this.z.r(32500);
      this.z.o(false);
      this.z.u("-");
      this.a = this.I.n();
      this.q();
      this.Y.O = !this.p.u().trim().isEmpty();
      this.s = new a8(this.p, true) {
         @Nullable
         public net.u.j D() {
            return b.this.I.z();
         }
      };
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(net.z.m var1) throws IOException {
      int var2 = j.u.g();
      if(var1.O) {
         if(var1.g == 1) {
            this.I.f(this.a);
            this.A.s((tu)null);
         }

         if(var1.g == 0) {
            net.n2.h var3 = new net.n2.h(Unpooled.buffer());
            var3.writeByte(this.I.o());
            this.I.L(var3);
            var3.R(this.p.u());
            var3.writeBoolean(this.I.n());
            this.A.d().L((net.n2.k)(new l("MC|AdvCmd", var3)));
            if(!this.I.n()) {
               this.I.u((net.cb.t)null);
            }

            this.A.s((tu)null);
         }

         if(var1.g == 4) {
            this.I.f(!this.I.n());
            this.q();
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      this.s.Y();
      if(var2 == 15) {
         this.s.g();
      } else {
         this.s.O();
      }

      this.p.l(var1, var2);
      this.z.l(var1, var2);
      this.Y.O = !this.p.u().trim().isEmpty();
      if(var2 != 28 && var2 != 156) {
         if(var2 == 1) {
            this.t(this.F);
         }
      } else {
         this.t(this.Y);
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.p.N(var1, var2, var3);
      this.z.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      j.u.C();
      this.d(this.O, net.c9.b.x("advMode.setCommand", new Object[0]), q / 2, 20, 16777215);
      this.n(this.O, net.c9.b.x("advMode.command", new Object[0]), q / 2 - 150, 40, 10526880);
      this.p.Z();
      int var5 = 75;
      int var6 = 0;
      this.n(this.O, net.c9.b.x("advMode.nearestPlayer", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.randomPlayer", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.allPlayers", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.allEntities", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      this.n(this.O, net.c9.b.x("advMode.self", new Object[0]), q / 2 - 140, var5 + var6++ * this.O.R, 10526880);
      if(!this.z.u().isEmpty()) {
         var5 = var5 + var6 * this.O.R + 20;
         this.n(this.O, net.c9.b.x("advMode.previousOutput", new Object[0]), q / 2 - 150, var5, 10526880);
         this.z.Z();
      }

      super.v(var1, var2, var3);
   }

   private void q() {
      if(this.I.n()) {
         this.J.J = "O";
         if(this.I.D() != null) {
            this.z.u(this.I.D().l());
         }
      } else {
         this.J.J = "X";
         this.z.u("-");
      }

   }

   public void r(String... var1) {
      this.s.U(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
