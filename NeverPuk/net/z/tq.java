package net.z;

import com.google.common.base.Predicate;
import java.io.IOException;
import java.net.IDN;
import javax.annotation.Nullable;
import net.yz.a7;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class tq extends tu {
   private final tu I;
   private final net.cp.d F;
   private wd U;
   private wd Z;
   private m a;
   private final Predicate R = new Predicate() {
      public boolean c(@Nullable String var1) {
         boolean var2 = g.B();
         if(a7.Y(var1)) {
            return true;
         } else {
            String[] var3 = var1.split(":");
            if(var3.length == 0) {
               return true;
            } else {
               IDN.toASCII(var3[0]);
               return true;
            }
         }
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }
   };

   public tq(tu var1, net.cp.d var2) {
      this.I = var1;
      this.F = var2;
   }

   public void K() {
      this.Z.K();
      this.U.K();
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.m.add(new m(0, q / 2 - 100, V / 4 + 96 + 18, net.c9.b.x("addServer.add", new Object[0])));
      g.C();
      this.m.add(new m(1, q / 2 - 100, V / 4 + 120 + 18, net.c9.b.x("gui.cancel", new Object[0])));
      this.a = this.x(new m(2, q / 2 - 100, V / 4 + 72, net.c9.b.x("addServer.resourcePack", new Object[0]) + ": " + this.F.z().v().c()));
      this.Z = new wd(0, this.O, q / 2 - 100, 66, 200, 20);
      this.Z.n(true);
      this.Z.u(this.F.U);
      this.U = new wd(1, this.O, q / 2 - 100, 106, 200, 20);
      this.U.r(128);
      this.U.u(this.F.C);
      this.U.n(this.R);
      ((m)this.m.get(0)).O = !this.U.u().isEmpty() && this.U.u().split(":").length > 0 && !this.Z.u().isEmpty();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 2) {
            this.F.F(net.cp.d.values()[(this.F.z().ordinal() + 1) % net.cp.d.values().length]);
            this.a.J = net.c9.b.x("addServer.resourcePack", new Object[0]) + ": " + this.F.z().v().c();
         } else if(var1.g == 1) {
            this.I.y(false, 0);
         } else if(var1.g == 0) {
            this.F.U = this.Z.u();
            this.F.C = this.U.u();
            this.I.y(true, 0);
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      this.Z.l(var1, var2);
      this.U.l(var1, var2);
      if(var2 == 15) {
         this.Z.n(!this.Z.Y());
         this.U.n(!this.U.Y());
      }

      if(var2 == 28 || var2 == 156) {
         this.t((m)this.m.get(0));
      }

      ((m)this.m.get(0)).O = !this.U.u().isEmpty() && this.U.u().split(":").length > 0 && !this.Z.u().isEmpty();
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.U.N(var1, var2, var3);
      this.Z.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("addServer.title", new Object[0]), q / 2, 17, 16777215);
      this.n(this.O, net.c9.b.x("addServer.enterName", new Object[0]), q / 2 - 100, 53, 10526880);
      this.n(this.O, net.c9.b.x("addServer.enterIp", new Object[0]), q / 2 - 100, 94, 10526880);
      this.Z.Z();
      this.U.Z();
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
