package net.z;

import java.io.IOException;
import java.util.Random;
import net.yv.o9;
import net.yz.a3;
import net.z.g;
import net.z.m;
import net.z.t5;
import net.z.tm;
import net.z.tu;
import net.z.wd;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class t1 extends tu {
   private final tu Q;
   private wd s;
   private wd p;
   private String w;
   private String D = "survival";
   private String y;
   private boolean Y = true;
   private boolean Z;
   private boolean B;
   private boolean r;
   private boolean a;
   private boolean J;
   private boolean I;
   private m F;
   private m R;
   private m K;
   private m W;
   private m z;
   private m T;
   private m o;
   private String u;
   private String S;
   private String l;
   private String b;
   private int n;
   public String U = "";
   private static final String[] f = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

   public t1(tu var1) {
      this.Q = var1;
      this.l = "";
      this.b = net.c9.b.x("selectWorld.newWorld", new Object[0]);
   }

   public void K() {
      this.s.K();
      this.p.K();
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.m.add(new m(0, q / 2 - 155, V - 28, 150, 20, net.c9.b.x("selectWorld.create", new Object[0])));
      this.m.add(new m(1, q / 2 + 5, V - 28, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.F = this.x(new m(2, q / 2 - 75, 115, 150, 20, net.c9.b.x("selectWorld.gameMode", new Object[0])));
      this.R = this.x(new m(3, q / 2 - 75, 187, 150, 20, net.c9.b.x("selectWorld.moreWorldOptions", new Object[0])));
      this.K = this.x(new m(4, q / 2 - 155, 100, 150, 20, net.c9.b.x("selectWorld.mapFeatures", new Object[0])));
      this.K.F = false;
      this.W = this.x(new m(7, q / 2 + 5, 151, 150, 20, net.c9.b.x("selectWorld.bonusItems", new Object[0])));
      this.W.F = false;
      this.z = this.x(new m(5, q / 2 + 5, 100, 150, 20, net.c9.b.x("selectWorld.mapType", new Object[0])));
      this.z.F = false;
      this.T = this.x(new m(6, q / 2 - 155, 151, 150, 20, net.c9.b.x("selectWorld.allowCommands", new Object[0])));
      this.T.F = false;
      this.o = this.x(new m(8, q / 2 + 5, 120, 150, 20, net.c9.b.x("selectWorld.customizeType", new Object[0])));
      this.o.F = false;
      this.s = new wd(9, this.O, q / 2 - 100, 60, 200, 20);
      this.s.n(true);
      this.s.u(this.b);
      this.p = new wd(10, this.O, q / 2 - 100, 60, 200, 20);
      this.p.u(this.l);
      this.c(this.I);
      this.Q();
      this.H();
   }

   private void Q() {
      this.w = this.s.u().trim();

      for(char var4 : a3.b) {
         this.w = this.w.replace(var4, '_');
      }

      if(StringUtils.isEmpty(this.w)) {
         this.w = "World";
      }

      this.w = p(this.A.l(), this.w);
   }

   private void H() {
      this.F.J = net.c9.b.x("selectWorld.gameMode", new Object[0]) + ": " + net.c9.b.x("selectWorld.gameMode." + this.D, new Object[0]);
      this.u = net.c9.b.x("selectWorld.gameMode." + this.D + ".line1", new Object[0]);
      this.S = net.c9.b.x("selectWorld.gameMode." + this.D + ".line2", new Object[0]);
      this.K.J = net.c9.b.x("selectWorld.mapFeatures", new Object[0]) + " ";
      if(this.Y) {
         this.K.J = this.K.J + net.c9.b.x("options.on", new Object[0]);
      } else {
         this.K.J = this.K.J + net.c9.b.x("options.off", new Object[0]);
      }

      this.W.J = net.c9.b.x("selectWorld.bonusItems", new Object[0]) + " ";
      if(this.r && !this.a) {
         this.W.J = this.W.J + net.c9.b.x("options.on", new Object[0]);
      } else {
         this.W.J = this.W.J + net.c9.b.x("options.off", new Object[0]);
      }

      this.z.J = net.c9.b.x("selectWorld.mapType", new Object[0]) + " " + net.c9.b.x(net.yv.j.O[this.n].I(), new Object[0]);
      this.T.J = net.c9.b.x("selectWorld.allowCommands", new Object[0]) + " ";
      if(this.Z && !this.a) {
         this.T.J = this.T.J + net.c9.b.x("options.on", new Object[0]);
      } else {
         this.T.J = this.T.J + net.c9.b.x("options.off", new Object[0]);
      }

   }

   public static String p(net.cg.j var0, String var1) {
      var1 = var1.replaceAll("[\\./\"]", "_");

      for(String var5 : f) {
         if(var1.equalsIgnoreCase(var5)) {
            var1 = "_" + var1 + "_";
         }
      }

      while(var0.y(var1) != null) {
         var1 = var1 + "-";
      }

      return var1;
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.C();
      if(var1.O) {
         if(var1.g == 1) {
            this.A.s(this.Q);
         }

         if(var1.g == 0) {
            this.A.s((tu)null);
            if(this.J) {
               return;
            }

            this.J = true;
            long var3 = (new Random()).nextLong();
            String var5 = this.p.u();
            if(!StringUtils.isEmpty(var5)) {
               long var6 = Long.parseLong(var5);
               if(var6 != 0L) {
                  var3 = var6;
               }
            }

            net.yv.t var8 = new net.yv.t(var3, o9.p(this.D), this.Y, this.a, net.yv.j.O[this.n]);
            var8.D(this.U);
            if(this.r && !this.a) {
               var8.X();
            }

            if(this.Z && !this.a) {
               var8.p();
            }

            this.A.p(this.w, this.s.u().trim(), var8);
         }

         if(var1.g == 3) {
            this.n();
         }

         if(var1.g == 2) {
            if("survival".equals(this.D)) {
               if(!this.B) {
                  this.Z = false;
               }

               this.a = false;
               this.D = "hardcore";
               this.a = true;
               this.T.O = false;
               this.W.O = false;
               this.H();
            }

            if("hardcore".equals(this.D)) {
               if(!this.B) {
                  this.Z = true;
               }

               this.a = false;
               this.D = "creative";
               this.H();
               this.a = false;
               this.T.O = true;
               this.W.O = true;
            }

            if(!this.B) {
               this.Z = false;
            }

            this.D = "survival";
            this.H();
            this.T.O = true;
            this.W.O = true;
            this.a = false;
            this.H();
         }

         if(var1.g == 4) {
            this.Y = !this.Y;
            this.H();
         }

         if(var1.g == 7) {
            this.r = !this.r;
            this.H();
         }

         if(var1.g == 5) {
            ++this.n;
            if(this.n >= net.yv.j.O.length) {
               this.n = 0;
            }

            while(!this.p()) {
               ++this.n;
               if(this.n >= net.yv.j.O.length) {
                  this.n = 0;
                  break;
               }
            }

            this.U = "";
            this.H();
            this.c(this.I);
         }

         if(var1.g == 6) {
            this.B = true;
            this.Z = !this.Z;
            this.H();
         }

         if(var1.g == 8) {
            if(net.yv.j.O[this.n] == net.yv.j.T) {
               this.A.s(new tm(this, this.U));
            }

            this.A.s(new t5(this, this.U));
         }
      }

   }

   private boolean p() {
      net.yv.j var1 = net.yv.j.O[this.n];
      return !var1.f()?false:var1 != net.yv.j.J || s();
   }

   private void n() {
      this.c(!this.I);
   }

   private void c(boolean var1) {
      this.I = var1;
      if(net.yv.j.O[this.n] == net.yv.j.J) {
         this.F.F = !this.I;
         this.F.O = false;
         if(this.y == null) {
            this.y = this.D;
         }

         this.D = "spectator";
         this.K.F = false;
         this.W.F = false;
         this.z.F = this.I;
         this.T.F = false;
         this.o.F = false;
      } else {
         this.F.F = !this.I;
         this.F.O = true;
         if(this.y != null) {
            this.D = this.y;
            this.y = null;
         }

         this.K.F = this.I && net.yv.j.O[this.n] != net.yv.j.C;
         this.W.F = this.I;
         this.z.F = this.I;
         this.T.F = this.I;
         this.o.F = this.I && (net.yv.j.O[this.n] == net.yv.j.T || net.yv.j.O[this.n] == net.yv.j.C);
      }

      this.H();
      if(this.I) {
         this.R.J = net.c9.b.x("gui.done", new Object[0]);
      } else {
         this.R.J = net.c9.b.x("selectWorld.moreWorldOptions", new Object[0]);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(this.s.Y() && !this.I) {
         this.s.l(var1, var2);
         this.b = this.s.u();
      } else if(this.p.Y() && this.I) {
         this.p.l(var1, var2);
         this.l = this.p.u();
      }

      if(var2 == 28 || var2 == 156) {
         this.t((m)this.m.get(0));
      }

      ((m)this.m.get(0)).O = !this.s.u().isEmpty();
      this.Q();
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      if(this.I) {
         this.p.N(var1, var2, var3);
      } else {
         this.s.N(var1, var2, var3);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("selectWorld.create", new Object[0]), q / 2, 20, -1);
      if(this.I) {
         this.n(this.O, net.c9.b.x("selectWorld.enterSeed", new Object[0]), q / 2 - 100, 47, -6250336);
         this.n(this.O, net.c9.b.x("selectWorld.seedInfo", new Object[0]), q / 2 - 100, 85, -6250336);
         if(this.K.F) {
            this.n(this.O, net.c9.b.x("selectWorld.mapFeatures.info", new Object[0]), q / 2 - 150, 122, -6250336);
         }

         if(this.T.F) {
            this.n(this.O, net.c9.b.x("selectWorld.allowCommands.info", new Object[0]), q / 2 - 150, 172, -6250336);
         }

         this.p.Z();
         if(net.yv.j.O[this.n].S()) {
            this.O.O(net.c9.b.x(net.yv.j.O[this.n].e(), new Object[0]), this.z.D + 2, this.z.R + 22, this.z.h(), 10526880);
         }
      } else {
         this.n(this.O, net.c9.b.x("selectWorld.enterName", new Object[0]), q / 2 - 100, 47, -6250336);
         this.n(this.O, net.c9.b.x("selectWorld.resultFolder", new Object[0]) + " " + this.w, q / 2 - 100, 85, -6250336);
         this.s.Z();
         this.n(this.O, this.u, q / 2 - 100, 137, -6250336);
         this.n(this.O, this.S, q / 2 - 100, 149, -6250336);
      }

      super.v(var1, var2, var3);
   }

   public void O(net.cg.z var1) {
      this.b = net.c9.b.x("selectWorld.newWorld.copyOf", new Object[]{var1.M()});
      this.l = var1.D() + "";
      this.n = var1.h().N();
      this.U = var1.X();
      this.Y = var1.X();
      this.Z = var1.u();
      if(var1.b()) {
         this.D = "hardcore";
      } else if(var1.h().a()) {
         this.D = "survival";
      } else if(var1.h().U()) {
         this.D = "creative";
      }

   }

   static {
      String[] var10000 = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
