package net.ni;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.ni.w;
import net.y9.rp;
import net.yz.a7;
import net.yz.aq;
import net.yz.ax;

public class s0 extends v implements net.yz.i {
   private int u;
   private int G;
   private GameProfile p;
   private int T;
   private boolean O;
   private static net.n.s s;
   private static MinecraftSessionService c;

   public static void R(net.n.s var0) {
      s = var0;
   }

   public static void B(MinecraftSessionService var0) {
      c = var0;
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.D("SkullType", (byte)(this.u & 255));
      var1.D("Rot", (byte)(this.G & 255));
      if(this.p != null) {
         net.nj.f var2 = new net.nj.f();
         net.nj.e.u(var2, this.p);
         var1.K("Owner", var2);
      }

      return var1;
   }

   public void G(net.nj.f var1) {
      w.C();
      super.G(var1);
      this.u = var1.R("SkullType");
      this.G = var1.R("Rot");
      if(this.u == 3) {
         if(var1.K("Owner", 10)) {
            this.p = net.nj.e.g(var1.o("Owner"));
         }

         if(var1.K("ExtraType", 8)) {
            String var3 = var1.J("ExtraType");
            if(!a7.Y(var3)) {
               this.p = new GameProfile((UUID)null, var3);
               this.B();
            }
         }
      }

   }

   public void m() {
      if(this.u == 5) {
         if(this.J.B(this.S)) {
            this.O = true;
            ++this.T;
         } else {
            this.O = false;
         }
      }

   }

   public float j(float var1) {
      return this.O?(float)this.T + var1:(float)this.T;
   }

   @Nullable
   public GameProfile U() {
      return this.p;
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 4, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public void M(int var1) {
      this.u = var1;
      this.p = null;
   }

   public void B(@Nullable GameProfile var1) {
      this.u = 3;
      this.p = var1;
      this.B();
   }

   private void B() {
      this.p = W(this.p);
      this.W();
   }

   public static GameProfile W(GameProfile var0) {
      if(!a7.Y(var0.getName())) {
         if(var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if(s != null && c != null) {
            GameProfile var1 = s.M(var0.getName());
            return var0;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public int Z() {
      return this.u;
   }

   public int F() {
      return this.G;
   }

   public void T(int var1) {
      this.G = var1;
   }

   public void w(ax var1) {
      if(this.J != null && this.J.Z(this.C()).i(rp.N) == aq.UP) {
         this.G = var1.l(this.G, 16);
      }

   }

   public void v(net.yz.l var1) {
      if(this.J != null && this.J.Z(this.C()).i(rp.N) == aq.UP) {
         this.G = var1.K(this.G, 16);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
