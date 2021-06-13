package net.yl;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.FutureTask;
import net._q;
import net.i6;
import net.xn;
import net.cg.d;
import net.d.w;
import net.n.s;
import net.nn.p;
import net.nv.q;
import net.nx.f;
import net.yk.e;
import net.yl.x;
import net.yv.i;
import net.yv.l;
import net.yv.m;
import net.yv.o9;
import net.yv.t;
import net.yz.at;
import net.yz.az;
import net.yz.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j extends f {
   private static final Logger gK = LogManager.getLogger();
   private final net.nn.j g5;
   private final t gH;
   private boolean gn;
   private boolean gD;
   private net.cp.f g6;
   private static int[] gR;

   public j(net.nn.j var1, String var2, String var3, t var4, YggdrasilAuthenticationService var5, MinecraftSessionService var6, GameProfileRepository var7, s var8) {
      super(new File(var1.sn, "saves"), var1.u(), var1.a(), var5, var6, var7, var8);
      this.R(var1.L().w());
      this.C(var2);
      this.G(var3);
      this.L(var1.e());
      this.I(var4.I());
      this.F(256);
      this.K(new net.yl.z(this));
      this.g5 = var1;
      this.gH = this.z()?i.W9:var4;
   }

   public q t() {
      return new x(this);
   }

   public void V(String var1, String var2, long var3, net.yv.j var5, String var6) {
      this.I(var1);
      d();
      d var8 = this.g().i(var1, true);
      this.x(this.q(), var8);
      net.cg.z var9 = var8.F();
      if(i6.N.l()) {
         net.yv.d var10 = this.z()?(net.yv.d)(new i(this, var8, var9, 0, this.a)).H():(net.yv.d)(new _q(this, var8, var9, 0, this.a)).H();
         var10.h(this.gH);
         Integer[] var11 = (Integer[])((Integer[])i6.H(i6.q, new Object[0]));
         int var13 = var11.length;
         int var14 = 0;
         if(var14 < var13) {
            int var15 = var11[var14].intValue();
            var10.n(new net.yv.s(this, var10));
            if(!this.n()) {
               var10.B().D(this.R());
            }

            if(i6.c.l()) {
               i6.C(i6.BJ, new Object[]{var10});
            }

            ++var14;
            net.u.d.h(new net.u.d[4]);
         }

         this.c().K(new net.yv.d[]{var10});
         if(var10.B().k() == null) {
            this.L(this.g5.T.iA);
         }
      }

      this.w1 = new net.yv.d[3];
      this.m = new long[this.w1.length][100];
      this.x(this.q(), var8);
      if(var9 == null) {
         var9 = new net.cg.z(this.gH, var2);
      }

      var9.I(var2);
      int var17 = 0;
      if(var17 < this.w1.length) {
         byte var19 = 0;
         if(this.z()) {
            this.w1[var17] = (net.yv.d)(new i(this, var8, var9, var19, this.a)).H();
         }

         this.w1[var17] = (net.yv.d)(new _q(this, var8, var9, var19, this.a)).H();
         this.w1[var17].h(this.gH);
         this.w1[var17] = (net.yv.d)(new m(this, var8, var19, this.w1[0], this.a)).H();
         this.w1[var17].n(new net.yv.s(this, this.w1[var17]));
         ++var17;
      }

      this.c().K(this.w1);
      if(this.w1[0].B().k() == null) {
         this.L(this.g5.T.iA);
      }

      this.z();
   }

   public boolean A() throws IOException {
      gK.info("Starting integrated minecraft server version 1.12.2");
      this.y(true);
      this.v(true);
      this.E(true);
      this.t(true);
      this.r(true);
      gK.info("Generating keypair");
      this.A(az.p());
      if(i6.u5.r()) {
         Object var1 = i6.H(i6.MN, new Object[0]);
         if(!i6.I(var1, i6.u5, new Object[]{this})) {
            return false;
         }
      }

      this.V(this.q(), this.H(), this.gH.r(), this.gH.H(), this.gH.T());
      this.y(this.Z() + " - " + this.w1[0].B().M());
      if(i6.Cj.r()) {
         Object var2 = i6.H(i6.MN, new Object[0]);
         if(i6.Cj.Y() == Boolean.TYPE) {
            return i6.I(var2, i6.Cj, new Object[]{this});
         }

         i6.F(var2, i6.Cj, new Object[]{this});
      }

      return true;
   }

   public void Q() {
      boolean var1 = this.gn;
      this.gn = net.nn.j.b().d() != null && net.nn.j.b().F();
      if(this.gn) {
         gK.info("Saving and pausing game...");
         this.c().o();
         this.c(false);
      }

      if(this.gn) {
         Queue var2 = this.k;

         while(!this.k.isEmpty()) {
            h.a((FutureTask)this.k.poll(), gK);
         }
      } else {
         super.Q();
         if(this.g5.T.ij != this.c().W()) {
            gK.info("Changing view distance to {}, from {}", Integer.valueOf(this.g5.T.ij), Integer.valueOf(this.c().W()));
            this.c().Z(this.g5.T.ij);
         }

         if(this.g5.s8 != null) {
            net.cg.z var8 = this.w1[0].B();
            net.cg.z var3 = this.g5.s8.B();
            if(!var8.s() && var3.k() != var8.k()) {
               gK.info("Changing difficulty to {}, from {}", var3.k(), var8.k());
               this.L(var3.k());
            } else if(var3.s() && !var8.s()) {
               gK.info("Locking difficulty to {}", var3.k());

               for(net.yv.d var7 : this.w1) {
                  var7.B().k(true);
               }
            }
         }
      }

   }

   public boolean v() {
      return false;
   }

   public o9 R() {
      return this.gH.H();
   }

   public l h() {
      return this.g5.s8 == null?this.g5.T.iA:this.g5.s8.B().k();
   }

   public boolean h() {
      return this.gH.h();
   }

   public boolean N() {
      return true;
   }

   public boolean D() {
      return true;
   }

   public void c(boolean var1) {
      super.c(var1);
   }

   public File R() {
      return this.g5.sn;
   }

   public boolean a() {
      return false;
   }

   public boolean M() {
      return false;
   }

   public void w(w var1) {
      this.g5.r(var1);
   }

   public w o(w var1) {
      var1 = super.o(var1);
      var1.k().L("Type", new net.d.t() {
         public String m() throws Exception {
            return "Integrated Server (map_client.txt)";
         }
      });
      var1.k().L("Is Modded", new net.d.t() {
         public String g() throws Exception {
            j.gR;
            String var2 = p.S();
            if(!var2.equals("vanilla")) {
               return "Definitely; Client brand changed to \'" + var2 + "\'";
            } else {
               var2 = j.this.h();
               if(!"vanilla".equals(var2)) {
                  return "Definitely; Server brand changed to \'" + var2 + "\'";
               } else {
                  String var10000 = net.nn.j.class.getSigners() == null?"Very likely; Jar signature invalidated":"Probably not. Jar signature remains and both client + server brands are untouched.";
                  if(net.u.d.y() == null) {
                     j.gR = new int[2];
                  }

                  return var10000;
               }
            }
         }

         private static Exception a(Exception var0) {
            return var0;
         }
      });
      return var1;
   }

   public void L(l var1) {
      super.L(var1);
      if(this.g5.s8 != null) {
         this.g5.s8.B().b(var1);
      }

   }

   public void f(e var1) {
      super.f(var1);
      var1.H("snooper_partner", this.g5.e().K());
   }

   public boolean V() {
      return net.nn.j.b().V();
   }

   public String e(o9 var1, boolean var2) {
      int var3 = -1;
      var3 = at.T();
      var3 = 25564;
      this.P().d((InetAddress)null, var3);
      gK.info("Started on {}", Integer.valueOf(var3));
      this.gD = true;
      this.g6 = new net.cp.f(this.t(), var3 + "");
      this.g6.start();
      this.c().Z(var1);
      this.c().S(var2);
      this.g5.sf.B(4);
      return var3 + "";
   }

   public void k() {
      super.k();
      if(this.g6 != null) {
         this.g6.interrupt();
         this.g6 = null;
      }

   }

   public void G() {
      if(!i6.U7.l() || this.l()) {
         Futures.getUnchecked(this.d(new Runnable() {
            public void run() {
               j.gR;
               Iterator var2 = Lists.newArrayList(j.this.c().D()).iterator();
               if(var2.hasNext()) {
                  net.r.h var3 = (net.r.h)var2.next();
                  if(!var3.O().equals(j.this.g5.sf.O())) {
                     j.this.c().o(var3);
                  }
               }

            }

            private static xn a(xn var0) {
               return var0;
            }
         }));
      }

      super.G();
      if(this.g6 != null) {
         this.g6.interrupt();
         this.g6 = null;
      }

   }

   public boolean w() {
      return this.gD;
   }

   public void C(o9 var1) {
      super.C(var1);
      this.c().Z(var1);
   }

   public boolean X() {
      return true;
   }

   public int m() {
      return 4;
   }

   static {
      Y(new int[2]);
   }

   public static void Y(int[] var0) {
      gR = var0;
   }

   public static int[] d() {
      return gR;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
