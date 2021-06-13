package net;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.io.IOException;
import java.net.Proxy;
import java.util.UUID;
import net.gn;
import net.iw;
import net.o7;
import net.ov;
import net.p9;
import net.wt;
import net.xe;
import net.xh;
import net.y0.l;
import net.yz.u;
import net.z.m;
import net.z.r;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public class o1 extends tu {
   public static String R = "none";
   public static String K = "none";
   public static int p = 0;
   public static int s = 0;
   private final ov Z;
   public String n = "";
   private p9 f;
   private p9 S;
   private o7 r;
   private net.z.wd z;

   public o1(tu var1) {
      this.Z = (ov)var1;
   }

   public void t(m var1) throws IOException {
      boolean var2 = l.B();
      if(var1.O) {
         switch(var1.g) {
         case 0:
            this.A.s(this.Z);
         case 1:
            String var3 = this.r.s();
            wt var4 = new wt(var3.contains("api")?var3:"");
            gn.Z(var3.contains("api")?var3:"");
            this.n = "§cLogging in...";
            ov.b.n(xe.a.THEALTENING);
            YggdrasilUserAuthentication var6 = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString()), Agent.MINECRAFT);
            var6.setUsername(var4.W().t());
            var6.setPassword("gg");
            var6.logIn();
            this.A.sV = new u(var6.getSelectedProfile().getName(), var6.getSelectedProfile().getId().toString(), var6.getAuthenticatedToken(), "legacy");
            R = var4.W().A().F();
            p = var4.W().A().L();
            K = var4.W().A().v();
            s = var4.W().A().U();
            this.Z.I = "§fYour name is now §a" + var6.getSelectedProfile().getName() + "§f.";
            this.A.s(this.Z);
            break;
         case 2:
            ov.b.n(xe.a.THEALTENING);
            this.n = "§cLogging in...";
            YggdrasilUserAuthentication var5 = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, ""), Agent.MINECRAFT);
            var5.setUsername(this.z.u());
            var5.setPassword("NeverHook");
            var5.logIn();
            this.A.sV = new u(var5.getSelectedProfile().getName(), var5.getSelectedProfile().getId().toString(), var5.getAuthenticatedToken(), "mojang");
            this.Z.I = "§fYour name is now §a" + var5.getSelectedProfile().getName() + "f.";
            this.A.s(this.Z);
            break;
         case 3:
            iw.Y("https://thealtening.com/");
         }

         super.t(var1);
      }
   }

   public void v(int var1, int var2, float var3) {
      xh.J(0.0D, 0.0D, (double)q, (double)V, (new Color(50, 45, 45, 255)).getRGB());
      this.A.x.I("TheAltening", (float)q / 2.0F, 6.0F, 16777215);
      this.A.x.I(this.n, (float)q / 2.0F, 18.0F, 16777215);
      this.r.K();
      this.z.Z();
      if(this.r.s().isEmpty() && !this.r.K()) {
         this.n(this.A.sO, "Api-Key", q / 2 - 96, 156, -7829368);
      }

      if(this.z.u().isEmpty() && !this.z.Y()) {
         this.n(this.A.sO, "Token", q / 2 - 96, 86, -7829368);
      }

      super.v(var1, var2, var3);
   }

   public void L() {
      r var1 = this.A.sO;
      Keyboard.enableRepeatEvents(true);
      this.f = new p9(2, q / 2 - 100, 105, "Login");
      this.m.add(this.f);
      this.S = new p9(1, q / 2 - 100, 175, "Generate");
      this.m.add(this.S);
      this.m.add(new p9(3, q / 2 - 100, V - 83, "Buy"));
      this.m.add(new p9(0, q / 2 - 100, V - 60, "Back"));
      this.z = new net.z.wd(666, var1, q / 2 - 100, 80, 200, 20);
      this.z.u = Integer.MAX_VALUE;
      this.r = new o7(var1, q / 2 - 100, 150, 200, 20);
      this.r.n(gn.k() != null?gn.k():"");
      this.r.o = 18;
      super.L();
   }

   protected void Q(char var1, int var2) throws IOException {
      if(1 == var2) {
         this.A.s(this.Z);
      } else {
         if(this.r.Y) {
            this.r.O(var1, var2);
         }

         if(this.z.w) {
            this.z.l(var1, var2);
         }

         super.Q(var1, var2);
      }
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      this.r.k(var1, var2, var3);
      this.z.N(var1, var2, var3);
      super.C(var1, var2, var3);
   }

   public void K() {
      this.r.I();
      this.z.K();
      super.K();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      super.x();
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
