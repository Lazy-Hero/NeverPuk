package net;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.net.Proxy;
import net.dh;
import net.gn;
import net.is;
import net.o7;
import net.ov;
import net.p1;
import net.p9;
import net.xh;
import net.xn;
import net.z.m;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public class p5 extends tu {
   private final ov H;
   private o7 z;
   private String Y = net.cb.z.GRAY + "Idle...";
   private net.z.wd W;

   p5(ov var1) {
      this.H = var1;
   }

   private static void S(p5 var0, String var1) {
      var0.Y = var1;
   }

   protected void t(m var1) {
      switch(var1.g) {
      case 0:
         p5.h var2 = new p5.h(this.W.u(), this.z.s());
         var2.start();
         break;
      case 1:
         this.A.s(this.H);
         break;
      case 2:
         String var3 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
         if(var3.contains(":")) {
            String[] var4 = var3.split(":");
            this.W.u(var4[0]);
            this.z.n(var4[1]);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      p1.K();
      xh.T(0.0D, 0.0D, (double)q, (double)V, 0.5D, (new Color(22, 22, 22, 255)).getRGB(), (new Color(60, 60, 60, 255)).getRGB(), true);
      xh.T(new net.yz.m_("neverhook/skeet.png"), 1.0F, 1.0F, 958.0F, 1.0F, Color.white);
      this.W.Z();
      this.z.K();
      this.A.x.I("Add Alt", (float)(q / 2), 20.0F, -1);
      if(this.W.u().isEmpty() && !this.W.Y()) {
         this.n(this.A.sO, "Username / E-Mail", q / 2 - 96, 66, -7829368);
      }

      if(this.z.s().isEmpty() && !this.z.K()) {
         this.n(this.A.sO, "Password", q / 2 - 96, 106, -7829368);
      }

      this.A.x.I(this.Y, (float)q / 2.0F, 30.0F, -1);
      super.v(var1, var2, var3);
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.m.add(new p9(0, q / 2 - 100, V / 4 + 92 + 12, "Login"));
      this.m.add(new p9(1, q / 2 - 100, V / 4 + 116 + 12, "Back"));
      this.m.add(new p9(2, q / 2 - 100, V / 4 + 92 - 12, "Import user:pass"));
      this.W = new net.z.wd(this.P, this.A.sO, q / 2 - 100, 60, 200, 20);
      this.z = new o7(this.A.sO, q / 2 - 100, 100, 200, 20);
   }

   protected void Q(char var1, int var2) {
      this.W.l(var1, var2);
      this.z.O(var1, var2);
      if(var1 == 9 && (this.W.Y() || this.z.K())) {
         this.W.n(!this.W.Y());
         this.z.P(!this.z.K());
      }

      if(var1 == 13) {
         this.t((m)this.m.get(0));
      }

   }

   protected void C(int var1, int var2, int var3) {
      super.C(var1, var2, var3);
      this.W.N(var1, var2, var3);
      this.z.k(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }

   private class h extends Thread {
      private final String N;
      private final String h;

      h(String var2, String var3) {
         this.h = var2;
         this.N = var3;
         p5.S(p5.this, net.cb.z.GRAY + "Idle...");
      }

      private void E(String var1, String var2) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
         YggdrasilUserAuthentication var4 = (YggdrasilUserAuthentication)var3.createUserAuthentication(Agent.MINECRAFT);
         var4.setUsername(var1);
         var4.setPassword(var2);
         var4.logIn();
         is.O.add(new p1(var1, var2, var4.getSelectedProfile().getName(), p1.q.Working));
         gn.Y().q(dh.class).Q();
         p5.S(p5.this, "Alt added. (" + var1 + ")");
      }

      public void run() {
         int var1 = p1.o();
         if(this.N.equals("")) {
            is.O.add(new p1(this.h, ""));
            p5.S(p5.this, net.cb.z.GREEN + "Alt added. (" + this.h + " - offline name)");
         }

         p5.S(p5.this, net.cb.z.AQUA + "Trying alt...");
         this.E(this.h, this.N);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
