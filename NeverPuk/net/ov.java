package net;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.d1;
import net.dh;
import net.gn;
import net.is;
import net.o1;
import net.oi;
import net.p1;
import net.p5;
import net.p9;
import net.px;
import net.wz;
import net.xe;
import net.xg;
import net.xh;
import net.c9.b;
import net.cp.d;
import net.cp.e;
import net.z.m;
import net.z.r;
import net.z.t;
import net.z.t9;
import net.z.tt;
import net.z.tu;
import org.apache.commons.lang3.RandomStringUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class ov extends tu {
   public static final xe b = new xe();
   public p1 u = null;
   public String I = net.cb.z.GRAY + "Alts...";
   private p9 y;
   private p9 Q;
   private p9 F;
   private wz D;
   private double K;
   private net.z.wd p;

   public void t(m var1) {
      switch(var1.g) {
      case 0:
      default:
         break;
      case 1:
         (this.D = new wz(this.u)).start();
         break;
      case 2:
         if(this.D != null) {
            this.D = null;
         }

         is.O.remove(this.u);
         this.I = "§aRemoved.";
         gn.Y().q(dh.class).Q();
         this.u = null;
         break;
      case 3:
         this.A.s(new p5(this));
         break;
      case 4:
         this.A.s(new px(this));
         break;
      case 5:
         new Random();
         (this.D = new wz(new p1("NeverUser" + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(2), ""))).start();
         break;
      case 6:
         this.A.s(new oi(this));
         break;
      case 7:
         this.A.s(new tt());
         break;
      case 8:
         is.O.clear();
         gn.Y().q(dh.class).n();
         this.I = "§bRefreshed!";
         break;
      case 1919:
         this.A.s(new o1(this));
         break;
      case 4545:
         this.A.s(new e(this, this.A, new d(b.x("selectServer.defaultName", new Object[0]), "play.hypixel.net", false)));
         break;
      case 8931:
         this.A.s(new t9(this));
      }

   }

   public void v(int var1, int var2, float var3) {
      p1.o();
      new t(this.A);
      xh.T(0.0D, 0.0D, (double)q, (double)V, 0.5D, (new Color(22, 22, 22, 255)).getRGB(), (new Color(60, 60, 60, 255)).getRGB(), true);
      if(Mouse.hasWheel()) {
         label84: {
            int var6 = Mouse.getDWheel();
            if(var6 < 0) {
               this.K += 26.0D;
               if(Double.compare(this.K, 0.0D) >= 0) {
                  break label84;
               }

               this.K = 0.0D;
               net.u.d.h(new net.u.d[2]);
            }

            if(var6 > 0) {
               this.K -= 26.0D;
               if(Double.compare(this.K, 0.0D) < 0) {
                  this.K = 0.0D;
               }
            }
         }
      }

      xh.T(new net.yz.m_("neverhook/skeet.png"), 1.0F, 1.0F, 958.0F, 1.0F, Color.white);
      xh.u((double)((float)q / 2.0F - 5.0F), 31.0D, (double)(q - 10), (double)(V - 50), 2.0D, (new Color(10, 10, 10, 255)).getRGB(), (new Color(32, 32, 32, 255)).getRGB());
      r var16 = this.O;
      String var7 = "Name: " + (gn.Q.j.d(d1.class).v()?"Protected":this.A.sV.w());
      this.A.x.i(net.cb.z.GRAY + "~ User Info ~", 15.0F, 75.0F, -1);
      this.A.x.i(var7, 10.0F, 87.0F, 14540253);
      this.A.x.i("Account Status: " + net.cb.z.GREEN + "Working", 10.0F, 98.0F, 14540253);
      xh.J((double)(this.A.x.s("Account Status: Working") + 12), (double)(this.A.x.S("Account Status: Working") + 89), 9.0D, (double)(this.A.x.S("Account Status: Working") + 100), xg.m(255, 30));
      xh.J((double)(this.A.x.s(var7) + 12), (double)(this.A.x.S(var7) + 78), 9.0D, (double)(this.A.x.S(var7) + 89), xg.m(255, 30));
      xh.u(82.0D, 82.0D, 82.0D, 12.0D, 3.0D, -1, -1);
      net.y.d.c();
      xh.T(new net.yz.m_("neverhook/info.png"), 13.0F, 8.0F, 64.0F, 64.0F, Color.white);
      net.y.d.E();
      net.y.d.Y();
      this.A.x.I("Account Manager - " + is.O.size() + " alts", (float)q / 2.0F, 10.0F, -1);
      this.A.x.I(this.D == null?this.I:this.D.H(), (float)q / 2.0F, 20.0F, -1);
      GL11.glPushMatrix();
      this.O(0.0F, 33.0F, (float)q, (float)(V - 50));
      GL11.glEnable(3089);
      int var8 = 38;
      int var9 = 0;

      for(p1 var11 : this.I()) {
         if(this.Q(var8)) {
            ++var9;
            if(var11.E().equals("")) {
               String var12 = var11.N();
            }

            String var17 = var11.E();
            if(var17.equalsIgnoreCase(this.A.sV.w())) {
               var17 = "§n" + var17;
            }

            String var13 = var11.I().equals(p1.q.Banned)?"§c":(var11.I().equals(p1.q.NotWorking)?"§m":"");
            var17 = var13 + var17;
            if(var11.Z().equals("")) {
               String var14 = "§cCracked";
            }

            String var19;
            label1299: {
               var19 = var11.Z().replaceAll(".", "*");
               if(var11 != this.u) {
                  if(this.E((double)var1, (double)var2, (double)var8 - this.K) && Mouse.isButtonDown(0)) {
                     xh.u((double)((float)q / 2.0F), (double)var8 - this.K - 4.0D, (double)(q - 52), (double)var8 - this.K + 20.0D, 1.0D, -xg.m(195, 50), -2146101995);
                  }

                  if(!this.E((double)var1, (double)var2, (double)var8 - this.K)) {
                     break label1299;
                  }

                  xh.u((double)((float)q / 2.0F), (double)var8 - this.K - 4.0D, (double)(q - 52), (double)var8 - this.K + 20.0D, 1.0D, xg.m(195, 50), -2145180893);
               }

               if(this.E((double)var1, (double)var2, (double)var8 - this.K) && Mouse.isButtonDown(0)) {
                  xh.u((double)((float)q / 2.0F), (double)var8 - this.K - 4.0D, (double)(q - 77), (double)var8 - this.K + 20.0D, 1.0D, xg.m(195, 50), -2142943931);
               }

               if(this.E((double)var1, (double)var2, (double)var8 - this.K)) {
                  xh.u((double)((float)q / 2.0F), (double)var8 - this.K - 4.0D, (double)(q - 77), (double)var8 - this.K + 20.0D, 1.0D, xg.m(195, 50), -2142088622);
               }

               xh.u((double)((float)q / 2.0F), (double)var8 - this.K - 4.0D, (double)(q - 77), (double)var8 - this.K + 20.0D, 1.0D, xg.m(195, 50), -2144259791);
            }

            String var15 = "§7" + var9 + ". §f";
            this.A.x.c(var15 + (gn.Q.j.d(d1.class).v()?"Protected":var17), (double)q / 1.5D, (double)var8 - this.K, -1);
            this.A.x.c((var11.I().equals(p1.q.NotWorking)?"§m":"") + var19, (double)q / 1.5D, (double)var8 - this.K + 10.0D, xg.A(110));
            var8 += 26;
         }
      }

      GL11.glDisable(3089);
      GL11.glPopMatrix();
      super.v(var1, var2, var3);
      if(this.u == null) {
         this.y.O = false;
         this.Q.O = false;
         this.F.O = false;
      }

      this.y.O = true;
      this.Q.O = true;
      this.F.O = true;
      if(Keyboard.isKeyDown(200)) {
         this.K -= 26.0D;
      }

      if(Keyboard.isKeyDown(208)) {
         this.K += 26.0D;
      }

      if(Double.compare(this.K, 0.0D) < 0) {
         this.K = 0.0D;
      }

      this.p.Z();
      if(this.p.u().isEmpty() && !this.p.Y()) {
         this.n(this.A.sO, "Search Alt", q / 2 + 125, V - 18, xg.A(180));
      }

   }

   public void L() {
      this.p = new net.z.wd(this.P, this.A.sO, q / 2 + 116, V - 22, 72, 16);
      this.m.add(this.y = new p9(1, q / 2 - 122, V - 48, 100, 20, "Login"));
      this.m.add(this.Q = new p9(2, q / 2 - 40, V - 24, 70, 20, "Remove"));
      this.m.add(new p9(3, q / 2 + 4 + 86, V - 48, 100, 20, "Add"));
      this.m.add(new p9(4, q / 2 - 16, V - 48, 100, 20, "Direct Login"));
      this.m.add(new p9(5, q / 2 - 122, V - 24, 78, 20, "Random"));
      this.m.add(this.F = new p9(6, q / 2 + 38, V - 24, 70, 20, "Edit"));
      this.m.add(new p9(7, q / 2 - 190, V - 24, 60, 20, "Back"));
      this.m.add(new p9(8, q / 2 - 190, V - 48, 60, 20, "Refresh"));
      this.m.add(new p9(8931, q / 2 + 195, V - 48, 100, 20, "MultiPlayer"));
      this.y.O = false;
      this.Q.O = false;
      this.F.O = false;
   }

   protected void Q(char var1, int var2) {
      this.p.l(var1, var2);
      if((var1 == 9 || var1 == 13) && this.p.Y()) {
         this.p.n(!this.p.Y());
      }

      super.Q(var1, var2);
   }

   private boolean Q(int var1) {
      return (double)var1 - this.K <= (double)(V - 50);
   }

   private boolean E(double var1, double var3, double var5) {
      return var1 >= (double)(q / 2) && var3 >= var5 - 4.0D && var1 <= (double)(q - 77) && var3 <= var5 + 20.0D && var1 >= 0.0D && var3 >= 33.0D && var1 <= (double)q && var3 <= (double)(V - 50);
   }

   protected void C(int var1, int var2, int var3) {
      this.p.N(var1, var2, var3);
      if(this.K < 0.0D) {
         this.K = 0.0D;
      }

      double var4 = 38.0D - this.K;

      for(p1 var7 : this.I()) {
         if(this.E((double)var1, (double)var2, var4)) {
            if(var7 == this.u) {
               this.t(this.y);
               return;
            }

            this.u = var7;
         }

         if(var1 >= q - 76 && var1 <= q - 52 && (double)var2 >= var4 - 4.0D && (double)var2 <= var4 + 20.0D) {
            boolean var10 = true;
         } else {
            boolean var10000 = false;
         }

         if(var7 == this.u) {
            switch(null.d[var7.I().ordinal()]) {
            case 1:
               var7.d(p1.q.Working);
               break;
            case 2:
               var7.d(p1.q.Banned);
               break;
            case 3:
               var7.d(p1.q.NotWorking);
               break;
            case 4:
               var7.d(p1.q.Unchecked);
            }

            gn.Y().q(dh.class).Q();
         }

         var4 += 26.0D;
      }

      super.C(var1, var2, var3);
   }

   private List I() {
      ArrayList var1 = new ArrayList();

      for(p1 var3 : is.O) {
         if(this.p.u().isEmpty() || var3.E().toLowerCase().contains(this.p.u().toLowerCase()) || var3.N().toLowerCase().contains(this.p.u().toLowerCase())) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private void O(float var1, float var2, float var3, float var4) {
      t var5 = new t(this.A);
      int var6 = t.K();
      GL11.glScissor((int)(var1 * (float)var6), (int)(((float)var5.v() - var4) * (float)var6), (int)((var3 - var1) * (float)var6), (int)((var4 - var2) * (float)var6));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
