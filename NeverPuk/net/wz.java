package net;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.IOException;
import java.net.Proxy;
import net.d1;
import net.dh;
import net.gn;
import net.is;
import net.ov;
import net.p1;
import net.xe;
import net.nn.j;
import net.yz.u;

public final class wz extends Thread {
   private final p1 L;
   private final j p = j.b();
   private String Y;

   public wz(p1 var1) {
      super("Alt Login Thread");
      this.L = var1;
      this.Y = "§7Waiting...";
   }

   private u G(String var1, String var2) {
      ov.b.n(xe.a.MOJANG);
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
      YggdrasilUserAuthentication var4 = (YggdrasilUserAuthentication)var3.createUserAuthentication(Agent.MINECRAFT);
      var4.setUsername(var1);
      var4.setPassword(var2);
      var4.logIn();
      return new u(var4.getSelectedProfile().getName(), var4.getSelectedProfile().getId().toString(), var4.getAuthenticatedToken(), "mojang");
   }

   public String H() {
      return this.Y;
   }

   public void N(String var1) {
      this.Y = var1;
   }

   public void run() {
      int var1 = p1.K();
      if(this.L.Z().equals("")) {
         this.p.sV = new u(this.L.N(), "", "", "mojang");
         this.Y = "§aLogged in. (" + ChatFormatting.RED + this.L.N() + ChatFormatting.GREEN + " - offline name)";
      }

      this.Y = "§bLogging in...";
      u var2 = this.G(this.L.N(), this.L.Z());
      this.Y = "§cLogin failed!";
      if(this.L.I().equals(p1.q.Unchecked)) {
         this.L.d(p1.q.NotWorking);
         is.b = new p1(this.L.N(), this.L.Z());
         this.Y = "§aLogged in. (" + (gn.Q.j.d(d1.class).v()?"Protected":var2.w()) + ")";
         this.L.G(var2.w());
         this.p.sV = var2;
         if(this.L.I().equals(p1.q.Unchecked)) {
            this.L.d(p1.q.Working);
         }

         gn.Y().q(dh.class).Q();
      }

   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
