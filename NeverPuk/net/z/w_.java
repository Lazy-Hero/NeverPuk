package net.z;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import javax.annotation.Nullable;
import net.z.g;
import net.z.m;
import net.z.p;
import net.z.t1;
import net.z.tu;
import net.z.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w_ extends tu {
   private static final Logger U = LogManager.getLogger();
   protected tu W;
   protected String Y = "Select world";
   private String a;
   private m n;
   private m J;
   private m F;
   private m b;
   private p R;

   public w_(tu var1) {
      this.W = var1;
   }

   public void L() {
      this.Y = net.c9.b.x("selectWorld.title", new Object[0]);
      this.R = new p(this, this.A, q, V, 32, V - 64, 36);
      this.P();
   }

   public void m() throws IOException {
      super.m();
      this.R.q();
   }

   public void P() {
      this.J = this.x(new m(1, q / 2 - 154, V - 52, 150, 20, net.c9.b.x("selectWorld.select", new Object[0])));
      this.x(new m(3, q / 2 + 4, V - 52, 150, 20, net.c9.b.x("selectWorld.create", new Object[0])));
      this.F = this.x(new m(4, q / 2 - 154, V - 28, 72, 20, net.c9.b.x("selectWorld.edit", new Object[0])));
      this.n = this.x(new m(2, q / 2 - 76, V - 28, 72, 20, net.c9.b.x("selectWorld.delete", new Object[0])));
      this.b = this.x(new m(5, q / 2 + 4, V - 28, 72, 20, net.c9.b.x("selectWorld.recreate", new Object[0])));
      this.x(new m(0, q / 2 + 82, V - 28, 72, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.J.O = false;
      this.n.O = false;
      this.F.O = false;
      this.b.O = false;
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      if(var1.O) {
         w var3 = this.R.l();
         if(var1.g == 2) {
            if(var3 == null) {
               return;
            }

            var3.S();
         }

         if(var1.g == 1) {
            if(var3 == null) {
               return;
            }

            var3.e();
         }

         if(var1.g == 3) {
            this.A.s(new t1(this));
         }

         if(var1.g == 4) {
            if(var3 == null) {
               return;
            }

            var3.g();
         }

         if(var1.g == 0) {
            this.A.s(this.W);
         }

         if(var1.g == 5 && var3 != null) {
            var3.I();
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.a = null;
      this.R.Z(var1, var2, var3);
      this.d(this.O, this.Y, q / 2, 20, 16777215);
      super.v(var1, var2, var3);
      if(this.a != null) {
         this.U(Lists.newArrayList(Splitter.on("\n").split(this.a)), var1, var2);
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.R.x(var1, var2, var3);
   }

   protected void E(int var1, int var2, int var3) {
      super.E(var1, var2, var3);
      this.R.U(var1, var2, var3);
   }

   public void f(String var1) {
      this.a = var1;
   }

   public void b(@Nullable w var1) {
      boolean var2 = true;
      this.J.O = var2;
      this.n.O = var2;
      this.F.O = var2;
      this.b.O = var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
