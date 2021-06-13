package net.nv;

import java.util.Iterator;
import net.xn;
import net.nv.b;
import net.nv.d;
import net.nv.f;
import net.nv.g;
import net.nv.h;
import net.nv.i;
import net.nv.n;
import net.nv.o;
import net.nv.r;
import net.nv.t;
import net.nv.u;
import net.nv.y;
import net.nv.y0;
import net.nv.y1;
import net.nv.y2;
import net.nv.y3;
import net.nv.y4;
import net.nv.y5;
import net.nv.y6;
import net.nv.y7;
import net.nv.y8;
import net.nv.y9;
import net.nv.y_;
import net.nv.ya;
import net.nv.yc;
import net.nv.yd;
import net.nv.ye;
import net.nv.yf;
import net.nv.yg;
import net.nv.yh;
import net.nv.yj;
import net.nv.yk;
import net.nv.yl;
import net.nv.ym;
import net.nv.yn;
import net.nv.yo;
import net.nv.yp;
import net.nv.yq;
import net.nv.ys;
import net.nv.yt;
import net.nv.yu;
import net.nv.yv;
import net.nv.yw;
import net.nv.yy;
import net.nv.yz;

public class q extends o implements y {
   private final net.nx.f v;

   public q(net.nx.f var1) {
      this.v = var1;
      this.s(new y6());
      this.s(new yy());
      this.s(new d());
      this.s(new yn());
      this.s(new y5());
      this.s(new y_());
      this.s(new y4());
      this.s(new y3());
      this.s(new y1());
      this.s(new net.nt.i());
      this.s(new y0());
      this.s(new yl());
      this.s(new yp());
      this.s(new yq());
      this.s(new yo());
      this.s(new yz());
      this.s(new net.nt.t());
      this.s(new yh());
      this.s(new yc());
      this.s(new i());
      this.s(new net.nt.j());
      this.s(new net.nt.h());
      this.s(new y8());
      t.Y();
      this.s(new net.nt.q());
      this.s(new yu());
      this.s(new u());
      this.s(new net.nt.p());
      this.s(new yj());
      this.s(new yk());
      this.s(new net.nt.l());
      this.s(new yf());
      this.s(new yd());
      this.s(new n());
      this.s(new yw());
      this.s(new net.nt.m());
      this.s(new net.nt.u());
      this.s(new yv());
      this.s(new g());
      this.s(new r());
      this.s(new b());
      this.s(new net.nt.v());
      this.s(new net.nt.c());
      this.s(new ym());
      this.s(new y7());
      this.s(new ye());
      this.s(new yg());
      this.s(new ya());
      this.s(new y2());
      this.s(new ys());
      if(var1.a()) {
         this.s(new net.nt.o());
         this.s(new net.nt.d());
         this.s(new net.nt.s());
         this.s(new net.nt.b());
         this.s(new net.nt.n());
         this.s(new net.nt.w());
         this.s(new net.nt.x());
         this.s(new net.nt.g());
         this.s(new net.nt.k());
         this.s(new net.nt.y());
         this.s(new net.nt.a());
         this.s(new yt());
         this.s(new net.nt.r());
         this.s(new net.nt.f());
         this.s(new y9());
         net.u.d.h(new net.u.d[1]);
      }

      this.s(new net.nt.e());
      h.w(this);
   }

   public void L(f var1, net.nv.z var2, int var3, String var4, Object... var5) {
      t.Y();
      boolean var7 = true;
      net.nx.f var8 = this.v;
      if(!var1.x()) {
         var7 = false;
      }

      net.cb.h var9 = new net.cb.h("chat.type.admin", new Object[]{var1.Q(), new net.cb.h(var4, var5)});
      var9.E().i(net.cb.z.GRAY);
      var9.E().P(Boolean.valueOf(true));
      Iterator var10 = var8.c().D().iterator();
      if(var10.hasNext()) {
         net.r.r var11 = (net.r.r)var10.next();
         if(var11 != var1 && var8.c().Q(var11.e()) && var2.F(this.v, var1)) {
            if(var1 instanceof net.nx.f && this.v.D()) {
               boolean var16 = true;
            } else {
               boolean var10000 = false;
            }

            if(var1 instanceof net.n3.e && this.v.N()) {
               boolean var18 = true;
            } else {
               boolean var17 = false;
            }

            if(!(var1 instanceof net.n3.e) && !(var1 instanceof net.nx.f)) {
               var11.r(var9);
            }
         }
      }

      if(var1 != var8 && var8.w1[0].N().b("logAdminCommands")) {
         var8.r((net.cb.t)var9);
      }

      boolean var15 = var8.w1[0].N().b("sendCommandFeedback");
      if(var1 instanceof net.ni.w) {
         var15 = ((net.ni.w)var1).n();
      }

      if((var3 & 1) != 1 && var15 || var1 instanceof net.nx.f) {
         var1.r(new net.cb.h(var4, var5));
      }

   }

   protected net.nx.f Y() {
      return this.v;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
