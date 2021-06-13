package net.z;

import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.k5;
import net.n0.ks;
import net.yz.a3;
import net.yz.m_;
import net.z.g;
import net.z.l;
import net.z.m;
import net.z.tu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class tf extends tu {
   private static final Logger o = LogManager.getLogger();
   private static final m_ T = new m_("textures/gui/book.png");
   private final net.r.r U;
   private final ks Z;
   private final boolean R;
   private boolean I;
   private boolean u;
   private int p;
   private final int Q = 192;
   private final int Y = 192;
   private int D = 1;
   private int f;
   private net.nj.h S;
   private String y = "";
   private List b;
   private int a = -1;
   private tf.x r;
   private tf.x z;
   private m l;
   private m s;
   private m H;
   private m K;

   public tf(net.r.r var1, ks var2, boolean var3) {
      this.U = var1;
      this.Z = var2;
      this.R = var3;
      if(var2.D()) {
         net.nj.f var4 = var2.o();
         this.S = var4.A("pages", 8).j();
         this.D = this.S.z();
         if(this.D < 1) {
            this.D = 1;
         }
      }

      if(this.S == null) {
         this.S = new net.nj.h();
         this.S.m(new net.nj.y(""));
         this.D = 1;
      }

   }

   public void K() {
      super.K();
      ++this.p;
   }

   public void L() {
      this.m.clear();
      Keyboard.enableRepeatEvents(true);
      if(this.R) {
         this.s = this.x(new m(3, q / 2 - 100, 196, 98, 20, net.c9.b.x("book.signButton", new Object[0])));
         this.l = this.x(new m(0, q / 2 + 2, 196, 98, 20, net.c9.b.x("gui.done", new Object[0])));
         this.H = this.x(new m(5, q / 2 - 100, 196, 98, 20, net.c9.b.x("book.finalizeButton", new Object[0])));
         this.K = this.x(new m(4, q / 2 + 2, 196, 98, 20, net.c9.b.x("gui.cancel", new Object[0])));
      } else {
         this.l = this.x(new m(0, q / 2 - 100, 196, 200, 20, net.c9.b.x("gui.done", new Object[0])));
      }

      int var1 = (q - 192) / 2;
      boolean var10000 = true;
      this.r = (tf.x)this.x(new tf.x(1, var1 + 120, 156, true));
      this.z = (tf.x)this.x(new tf.x(2, var1 + 38, 156, false));
      this.q();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   private void q() {
      this.r.F = !this.u && (this.f < this.D - 1 || this.R);
      this.z.F = !this.u && this.f > 0;
      this.l.F = !this.R || !this.u;
      if(this.R) {
         this.s.F = !this.u;
         this.K.F = this.u;
         this.H.F = this.u;
         this.H.O = !this.y.trim().isEmpty();
      }

   }

   private void I(boolean var1) throws IOException {
      if(this.R && this.I && this.S != null) {
         while(this.S.z() > 1) {
            String var2 = this.S.w(this.S.z() - 1);
            if(!var2.isEmpty()) {
               break;
            }

            this.S.K(this.S.z() - 1);
         }

         if(this.Z.D()) {
            net.nj.f var4 = this.Z.o();
            var4.K("pages", this.S);
         } else {
            this.Z.Q("pages", this.S);
         }

         String var5 = "MC|BEdit";
         var5 = "MC|BSign";
         this.Z.Q("author", new net.nj.y(this.U.Q()));
         this.Z.Q("title", new net.nj.y(this.y.trim()));
         net.n2.h var3 = new net.n2.h(Unpooled.buffer());
         var3.D(this.Z);
         this.A.d().L((net.n2.k)(new net.m.l(var5, var3)));
      }

   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 0) {
            this.A.s((tu)null);
            this.I(false);
         } else if(var1.g == 3 && this.R) {
            this.u = true;
         } else if(var1.g == 1) {
            if(this.f < this.D - 1) {
               ++this.f;
            } else if(this.R) {
               this.O();
               if(this.f < this.D - 1) {
                  ++this.f;
               }
            }
         } else if(var1.g == 2) {
            if(this.f > 0) {
               --this.f;
            }
         } else if(var1.g == 5 && this.u) {
            this.I(true);
            this.A.s((tu)null);
         } else if(var1.g == 4 && this.u) {
            this.u = false;
         }

         this.q();
      }

   }

   private void O() {
      if(this.S != null && this.S.z() < 50) {
         this.S.m(new net.nj.y(""));
         ++this.D;
         this.I = true;
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      super.Q(var1, var2);
      if(this.R) {
         if(this.u) {
            this.P(var1, var2);
         } else {
            this.Y(var1, var2);
         }
      }

   }

   private void Y(char var1, int var2) {
      if(tu.L(var2)) {
         this.k(tu.s());
      } else {
         switch(var2) {
         case 14:
            String var3 = this.O();
            if(!var3.isEmpty()) {
               this.L(var3.substring(0, var3.length() - 1));
            }

            return;
         case 28:
         case 156:
            this.k("\n");
            return;
         default:
            if(a3.s(var1)) {
               this.k(Character.toString(var1));
            }
         }
      }

   }

   private void P(char var1, int var2) throws IOException {
      switch(var2) {
      case 14:
         if(!this.y.isEmpty()) {
            this.y = this.y.substring(0, this.y.length() - 1);
            this.q();
         }

         return;
      case 28:
      case 156:
         if(!this.y.isEmpty()) {
            this.I(true);
            this.A.s((tu)null);
         }

         return;
      default:
         if(this.y.length() < 16 && a3.s(var1)) {
            this.y = this.y + var1;
            this.q();
            this.I = true;
         }

      }
   }

   private String O() {
      return this.S != null && this.f >= 0 && this.f < this.S.z()?this.S.w(this.f):"";
   }

   private void L(String var1) {
      if(this.S != null && this.f >= 0 && this.f < this.S.z()) {
         this.S.S(this.f, new net.nj.y(var1));
         this.I = true;
      }

   }

   private void k(String var1) {
      String var2 = this.O();
      String var3 = var2 + var1;
      int var4 = this.O.t(var3 + "" + net.cb.z.BLACK + "_", 118);
      if(var4 <= 128 && var3.length() < 256) {
         this.L(var3);
      }

   }

   public void v(int var1, int var2, float var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(T);
      int var5 = (q - 192) / 2;
      g.B();
      boolean var10001 = true;
      this.g(var5, 2, 0, 0, 192, 192);
      if(this.u) {
         String var7 = this.y;
         if(this.R) {
            if(this.p / 6 % 2 == 0) {
               var7 = var7 + "" + net.cb.z.BLACK + "_";
            }

            var7 = var7 + "" + net.cb.z.GRAY + "_";
         }

         String var8 = net.c9.b.x("book.editTitle", new Object[0]);
         int var9 = this.O.r(var8);
         this.O.v(var8, (float)(var5 + 36 + (116 - var9) / 2), 34.0F, 0);
         int var10 = this.O.r(var7);
         this.O.v(var7, (float)(var5 + 36 + (116 - var10) / 2), 50.0F, 0);
         String var11 = net.c9.b.x("book.byAuthor", new Object[]{this.U.Q()});
         int var12 = this.O.r(var11);
         this.O.v(net.cb.z.DARK_GRAY + var11, (float)(var5 + 36 + (116 - var12) / 2), 60.0F, 0);
         String var13 = net.c9.b.x("book.finalizeWarning", new Object[0]);
         this.O.O(var13, var5 + 36, 82, 116, 0);
      }

      String var14 = net.c9.b.x("book.pageIndicator", new Object[]{Integer.valueOf(this.f + 1), Integer.valueOf(this.D)});
      String var15 = "";
      if(this.S != null && this.f >= 0 && this.f < this.S.z()) {
         var15 = this.S.w(this.f);
      }

      if(this.R) {
         if(this.O.y()) {
            var15 = var15 + "_";
         }

         if(this.p / 6 % 2 == 0) {
            var15 = var15 + "" + net.cb.z.BLACK + "_";
         }

         var15 = var15 + "" + net.cb.z.GRAY + "_";
      }

      if(this.a != this.f) {
         if(k5.e(this.Z.o())) {
            net.cb.t var16 = net.cb.t.m(var15);
            this.b = var16 != null?l.f(var16, 116, this.O, true, true):null;
         } else {
            net.cb.l var17 = new net.cb.l(net.cb.z.DARK_RED + "* Invalid book tag *");
            this.b = Lists.newArrayList(var17);
         }

         this.a = this.f;
      }

      int var18 = this.O.r(var14);
      this.O.v(var14, (float)(var5 - var18 + 192 - 44), 18.0F, 0);
      if(this.b == null) {
         this.O.O(var15, var5 + 36, 34, 116, 0);
      }

      int var19 = Math.min(128 / this.O.R, this.b.size());
      int var20 = 0;
      if(var20 < var19) {
         net.cb.t var23 = (net.cb.t)this.b.get(var20);
         this.O.v(var23.l(), (float)(var5 + 36), (float)(34 + var20 * this.O.R), 0);
         ++var20;
      }

      net.cb.t var22 = this.O(var1, var2);
      this.Z(var22, var1, var2);
      super.v(var1, var2, var3);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      net.cb.t var4 = this.O(var1, var2);
      if(!this.e(var4)) {
         super.C(var1, var2, var3);
      }
   }

   public boolean e(net.cb.t var1) {
      net.n6.k var2 = var1.E().T();
      return false;
   }

   @Nullable
   public net.cb.t O(int var1, int var2) {
      if(this.b == null) {
         return null;
      } else {
         int var3 = var1 - (q - 192) / 2 - 36;
         int var4 = var2 - 2 - 16 - 16;
         int var5 = Math.min(128 / this.O.R, this.b.size());
         if(var3 <= 116 && var4 < this.A.sO.R * var5 + var5) {
            int var6 = var4 / this.A.sO.R;
            if(var6 < this.b.size()) {
               net.cb.t var7 = (net.cb.t)this.b.get(var6);
               int var8 = 0;

               for(net.cb.t var10 : var7) {
                  if(var10 instanceof net.cb.l) {
                     var8 += this.A.sO.r(((net.cb.l)var10).N());
                     if(var8 > var3) {
                        return var10;
                     }
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }

   static class x extends m {
      private final boolean t;

      public x(int var1, int var2, int var3, boolean var4) {
         super(var1, var2, var3, 23, 13, "");
         this.t = var4;
      }

      public void Z(net.nn.j var1, int var2, int var3, float var4) {
         boolean var5 = g.C();
         if(this.F) {
            if(var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h) {
               boolean var9 = true;
            } else {
               boolean var10000 = false;
            }

            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            var1.n().E(tf.T);
            byte var7 = 0;
            int var8 = 192;
            if(!this.t) {
               var8 += 13;
            }

            this.g(this.D, this.R, var7, var8, 23, 13);
         }

      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
