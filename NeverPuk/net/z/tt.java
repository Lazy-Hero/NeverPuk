package net.z;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net._d;
import net.d1;
import net.dr;
import net.gn;
import net.ij;
import net.ir;
import net.ov;
import net.p6;
import net.wb;
import net.yz.m_;
import net.z.g;
import net.z.m;
import net.z.t;
import net.z.t8;
import net.z.t9;
import net.z.tu;
import net.z.w_;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class tt extends tu {
   private int r;
   private int p;
   private ir J = new ir("/noise.fsh");
   private final long H = System.currentTimeMillis();
   protected ArrayList T = new ArrayList();
   public static dr S = new dr();

   public void L() {
      t var1 = new t(this.A);
      this.r = var1.u();
      this.p = var1.v();
      this.m.add(new p6(0, this.r / 2 - 90, this.p / 2 + 4, 180, 15, "Singleplayer"));
      this.m.add(new p6(1, this.r / 2 - 90, this.p / 2 + 32, 180, 15, "Multiplayer"));
      this.m.add(new p6(2, this.r / 2 - 90, this.p / 2 + 60, 180, 15, "Alt Manager"));
      this.T.clear();
      this.T.add(new _d(new m_("neverhook/world.png"), this.r / 2 + 100, this.p / 2 + 4, 24, 24, "Language", 15));
      this.T.add(new _d(new m_("neverhook/misc.png"), this.r / 2 + 100, this.p / 2 + 34, 24, 24, "Options", 16));
      this.T.add(new _d(new m_("neverhook/quit.png"), this.r / 2 + 105, this.p / 2 + 68, 15, 15, "Quit Game", 14));
      this.T.add(new _d(new m_("neverhook/logo.png"), this.r / 2 - 30, this.p / 2 - 140, 60, 70, "", 13));
   }

   public void v(int var1, int var2, float var3) {
      g.B();
      t var5 = new t(this.A);
      int var6 = var5.u() / 2;
      int var7 = var5.v() / 2;
      net.y.d.c();
      net.y.d.E();
      net.y.d.j();
      this.J.n(var6, var7 * 4 + 150, (float)var1, (float)var2, (float)(System.currentTimeMillis() - this.H) / 200.0F);
      GL11.glBegin(7);
      GL11.glVertex2f(-1.0F, -1.0F);
      GL11.glVertex2f(-1.0F, 1.0F);
      GL11.glVertex2f(1.0F, 1.0F);
      GL11.glVertex2f(1.0F, -1.0F);
      GL11.glEnd();
      GL20.glUseProgram(0);
      t var8 = new t(this.A);
      int var9 = 22;
      byte var10 = 8;
      this.A.sO.U("ChangeLog", 3.0F, 7.0F, (new Color(175, 175, 175, 255)).getRGB());
      Iterator var11 = gn.i().T().iterator();
      if(var11.hasNext()) {
         wb var12 = (wb)var11.next();
         this.A.sO.U(var12.q(), (float)(var10 - 3), (float)(var9 - 3), -1);
         var9 = var9 + 10;
      }

      this.A.Z.i("Made with love by Smertnix & MyLifeIsShit & Basic", 1.0F, (float)(var8.v() - this.A.Z.f() - 2), -1);
      this.A.Z.i("NeverHook Client (#" + gn.w + ")", 10.0F, (float)(var8.v() - this.A.Z.f() - 14), -1);
      String var15 = "Welcome, " + this.A.L().w();
      this.A.Z.i(gn.Q.j.d(d1.class).v()?"Welcome, Protected":var15, (float)(var8.u() - 2 - this.A.Z.s(gn.Q.j.d(d1.class).v()?"Welcome, Protected":var15)), (float)(var8.v() - this.A.Z.f() - 2), -1);
      ij.o("От разработчиков WintWare", this.A.sO, (float)(var8.u() - 2 - this.A.sO.r("От разработчиков WintWare")), 2.0F, -1);
      Iterator var16 = this.T.iterator();
      if(var16.hasNext()) {
         _d var13 = (_d)var16.next();
         var13.h(var1, var2, Color.WHITE);
         if(Mouse.isButtonDown(0)) {
            var13.v(var1, var2);
         }
      }

      S.C((float)var1, (float)var2);
      net.y.d.Y();
      super.v(var1, var2, var3);
   }

   public void t(m var1) throws IOException {
      switch(var1.g) {
      case 0:
         this.A.s(new w_(this));
         break;
      case 1:
         this.A.s(new t9(this));
         break;
      case 2:
         this.A.s(new ov());
         break;
      case 3:
         this.A.s(new t8(this, this.A.T));
         break;
      case 4:
         System.exit(0);
      }

      super.t(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
