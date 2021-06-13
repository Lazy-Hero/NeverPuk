package net.z;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.yz.a2;
import net.yz.a8;
import net.z.g;
import net.z.tu;
import net.z.wd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class tg extends tu implements a2 {
   private static final Logger y = LogManager.getLogger();
   private String w = "";
   private int a = -1;
   private a8 z;
   protected wd H;
   private long I;
   private String o = "";

   public tg() {
   }

   public tg(String var1) {
      this.o = var1;
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.a = this.A.y.I().b().size();
      this.H = new wd(0, this.O, 4, V - 12, q - 4, 12);
      this.H.r(256);
      this.H.S(false);
      this.H.n(true);
      this.H.u(this.o);
      this.H.O(false);
      this.z = new tg.m(this.H);
      this.I = System.currentTimeMillis();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      this.A.y.I().i();
      this.I = System.currentTimeMillis();
   }

   public void K() {
      this.H.K();
   }

   protected void Q(char var1, int var2) throws IOException {
      boolean var3 = g.C();
      this.z.Y();
      if(var2 == 15) {
         this.z.g();
      }

      this.z.O();
      if(var2 == 1) {
         this.A.s((tu)null);
      }

      if(var2 != 28 && var2 != 156) {
         if(var2 == 200) {
            this.t(-1);
         }

         if(var2 == 208) {
            this.t(1);
         }

         if(var2 == 201) {
            this.A.y.I().x(this.A.y.I().A() - 1);
         }

         if(var2 == 209) {
            this.A.y.I().x(-this.A.y.I().A() + 1);
         }

         this.H.l(var1, var2);
      }

      String var4 = this.H.u().trim();
      if(!var4.isEmpty()) {
         this.B(var4);
      }

      this.A.s((tu)null);
   }

   public void m() throws IOException {
      super.m();
      int var1 = Mouse.getEventDWheel();
      if(var1 > 1) {
         var1 = 1;
      }

      if(var1 < -1) {
         var1 = -1;
      }

      if(!s()) {
         var1 *= 7;
      }

      this.A.y.I().x(var1);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      net.cb.t var4 = this.A.y.I().q(Mouse.getX(), Mouse.getY());
      if(!this.e(var4)) {
         this.H.N(var1, var2, var3);
         super.C(var1, var2, var3);
      }
   }

   protected void w(String var1, boolean var2) {
      this.H.u(var1);
   }

   public void t(int var1) {
      int var2 = this.a + var1;
      int var3 = this.A.y.I().b().size();
      var2 = net.u.t.g(var2, 0, var3);
      if(var2 != this.a) {
         if(var2 == var3) {
            this.a = var3;
            this.H.u(this.w);
         } else {
            if(this.a == var3) {
               this.w = this.H.u();
            }

            this.H.u((String)this.A.y.I().b().get(var2));
            this.a = var2;
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      double var4 = (double)z(this.I);
      net.y.d.J(0.0D, 14.0D - 14.0D * var4, 0.0D);
      u(2, V - 14, q - 2, V - 2, Integer.MIN_VALUE);
      this.H.Z();
      this.H.Z();
      net.cb.t var6 = this.A.y.I().q(Mouse.getX(), Mouse.getY());
      if(var6.E().W() != null) {
         this.Z(var6, var1, var2);
      }

      super.v(var1, var2, var3);
   }

   public static float z(long var0) {
      return Math.min(1.0F, (float)Math.pow((double)(System.currentTimeMillis() - var0) / 10.0D, 1.4D) / 80.0F);
   }

   public boolean b() {
      return false;
   }

   public void r(String... var1) {
      this.z.U(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static class m extends a8 {
      private final net.nn.j r = net.nn.j.b();

      public m(wd var1) {
         super(var1, false);
      }

      public void g() {
         g.C();
         super.g();
         if(this.A.size() > 1) {
            StringBuilder var2 = new StringBuilder();
            Iterator var3 = this.A.iterator();
            if(var3.hasNext()) {
               String var4 = (String)var3.next();
               if(var2.length() > 0) {
                  var2.append(", ");
               }

               var2.append(var4);
            }

            this.r.y.I().O(new net.cb.l(var2.toString()), 1);
         }

      }

      @Nullable
      public net.u.j D() {
         net.u.j var1 = null;
         if(this.r.H != null && this.r.H.v == net.u.m.BLOCK) {
            var1 = this.r.H.j();
         }

         return var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
