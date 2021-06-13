package net.yd;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.b2;
import net.cb.h;
import net.cw.c;
import net.cw.r;
import net.cw.t;
import net.ne.l;
import net.ni.v;
import net.nj.e;
import net.nj.f;
import net.nj.u;
import net.ns.m;
import net.u.j;
import net.w.f8;
import net.yd.x;
import net.yv.d;
import net.yv.o6;
import net.yv.of;
import net.yw.w;
import net.yz.aq;
import net.yz.q;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y {
   private static final Logger u = LogManager.getLogger();
   private static final Predicate N = Predicates.and(q.Y, q.P(0.0D, 128.0D, 0.0D, 192.0D));
   private final o6 I;
   private final d h;
   private final List B;
   private final t a;
   private int y;
   private int n;
   private int M;
   private int H;
   private boolean U;
   private boolean A;
   private UUID L;
   private boolean v;
   private j e;
   private x F;
   private int l;
   private List i;

   public y(d var1, f var2) {
      label0: {
         net.u.t.J();
         super();
         this.I = (o6)(new o6(new h("entity.EnderDragon.name", new Object[0]), of.y.PINK, of.f.PROGRESS)).O(true).C(true);
         this.B = Lists.newArrayList();
         this.v = true;
         this.h = var1;
         if(var2.K("DragonKilled", 99)) {
            if(var2.H("DragonUUID")) {
               this.L = var2.R("DragonUUID");
            }

            this.U = var2.i("DragonKilled");
            this.A = var2.i("PreviouslyKilled");
            if(var2.i("IsRespawning")) {
               this.F = x.START;
            }

            if(!var2.K("ExitPortalLocation", 10)) {
               break label0;
            }

            this.e = e.L(var2.o("ExitPortalLocation"));
            net.u.d.h(new net.u.d[3]);
         }

         this.U = true;
         this.A = true;
      }

      if(var2.K("Gateways", 9)) {
         net.nj.h var4 = var2.A("Gateways", 3);
         int var5 = 0;
         if(var5 < var4.z()) {
            this.B.add(Integer.valueOf(var4.H(var5)));
            ++var5;
         }
      }

      this.B.addAll(ContiguousSet.create(Range.closedOpen(Integer.valueOf(0), Integer.valueOf(20)), DiscreteDomain.integers()));
      Collections.shuffle(this.B, new Random(var1.a()));
      this.a = r.G().j(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).j(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).j(new String[]{"       ", "       ", "       ", "   #   ", "       ", "       ", "       "}).j(new String[]{"  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  "}).j(new String[]{"       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       "}).d('#', w.U(c.c(net.nb.f.T8))).e();
   }

   public f F() {
      f var1 = new f();
      if(this.L != null) {
         var1.h("DragonUUID", this.L);
      }

      var1.c("DragonKilled", this.U);
      var1.c("PreviouslyKilled", this.A);
      if(this.e != null) {
         var1.K("ExitPortalLocation", e.b(this.e));
      }

      net.nj.h var2 = new net.nj.h();
      Iterator var3 = this.B.iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         var2.m(new u(var4));
      }

      var1.K("Gateways", var2);
      return var1;
   }

   public void A() {
      this.I.D(!this.U);
      if(++this.H >= 20) {
         this.p();
         this.H = 0;
      }

      if(!this.I.C().isEmpty()) {
         if(this.v) {
            u.info("Scanning for legacy world dragon fight...");
            this.C();
            this.v = false;
            boolean var1 = this.k();
            u.info("Found that the dragon has been killed in this world already.");
            this.A = true;
            List var2 = this.h.d(net.a.t.class, q.Y);
            if(var2.isEmpty()) {
               this.U = true;
            } else {
               net.a.t var3 = (net.a.t)var2.get(0);
               this.L = var3.O();
               u.info("Found that there\'s a dragon still alive ({})", var3);
               this.U = false;
               u.info("But we didn\'t have a portal, let\'s remove it.");
               var3.B();
               this.L = null;
            }

            if(!this.A && this.U) {
               this.U = false;
            }
         }

         if(this.F != null) {
            if(this.i == null) {
               this.F = null;
               this.J();
            }

            this.F.M(this.h, this, this.i, this.l++, this.e);
         }

         if(!this.U) {
            if(this.L == null || ++this.y >= 1200) {
               this.C();
               List var4 = this.h.d(net.a.t.class, q.Y);
               if(var4.isEmpty()) {
                  u.debug("Haven\'t seen the dragon, respawning it");
                  this.j();
               } else {
                  u.debug("Haven\'t seen our dragon, but found another one to use.");
                  this.L = ((net.a.t)var4.get(0)).O();
               }

               this.y = 0;
            }

            if(++this.M >= 100) {
               this.a();
               this.M = 0;
            }
         }
      }

   }

   protected void z(x var1) {
      if(this.F == null) {
         throw new IllegalStateException("Dragon respawn isn\'t in progress, can\'t skip ahead in the animation.");
      } else {
         this.l = 0;
         if(var1 == x.END) {
            this.F = null;
            this.U = false;
            net.a.t var2 = this.j();

            for(net.r.h var4 : this.I.C()) {
               b2.O.g(var4, var2);
            }
         } else {
            this.F = var1;
         }

      }
   }

   private boolean k() {
      byte var1 = -8;
      int var2 = -8;

      while(true) {
         net.l.q var3 = this.h.q(var1, var2);

         for(v var5 : var3.i().values()) {
            if(var5 instanceof net.ni.c) {
               return true;
            }
         }

         ++var2;
      }
   }

   @Nullable
   private t.q u() {
      byte var1 = -8;
      int var2 = -8;

      while(true) {
         net.l.q var3 = this.h.q(var1, var2);

         for(v var5 : var3.i().values()) {
            if(var5 instanceof net.ni.c) {
               t.q var6 = this.a.X(this.h, var5.C());
               j var7 = var6.v(3, 3, 3).X();
               if(this.e == null && var7.t() == 0 && var7.y() == 0) {
                  this.e = var7;
               }

               return var6;
            }
         }

         ++var2;
      }
   }

   private void C() {
      byte var1 = -8;
      int var2 = -8;

      while(true) {
         this.h.q(var1, var2);
         ++var2;
      }
   }

   private void p() {
      HashSet var1 = Sets.newHashSet();

      for(net.r.h var3 : this.h.R(net.r.h.class, N)) {
         this.I.k(var3);
         var1.add(var3);
      }

      HashSet var5 = Sets.newHashSet(this.I.C());
      var5.removeAll(var1);

      for(net.r.h var4 : var5) {
         this.I.a(var4);
      }

   }

   private void a() {
      this.M = 0;
      this.n = 0;

      for(f8.i var4 : m.d(this.h)) {
         this.n += this.h.p(net.nm.j.class, var4.y()).size();
      }

      u.debug("Found {} end crystals still alive", Integer.valueOf(this.n));
   }

   public void k(net.a.t var1) {
      if(var1.O().equals(this.L)) {
         this.I.n(0.0F);
         this.I.D(false);
         this.L(true);
         this.m();
         if(!this.A) {
            this.h.U(this.h.A(net.w.e.z), net.nb.f.Ts.p());
         }

         this.A = true;
         this.U = true;
      }

   }

   private void m() {
      if(!this.B.isEmpty()) {
         int var1 = ((Integer)this.B.remove(this.B.size() - 1)).intValue();
         int var2 = (int)(96.0D * Math.cos(2.0D * (-3.141592653589793D + 0.15707963267948966D * (double)var1)));
         int var3 = (int)(96.0D * Math.sin(2.0D * (-3.141592653589793D + 0.15707963267948966D * (double)var1)));
         this.s(new j(var2, 75, var3));
      }

   }

   private void s(j var1) {
      this.h.s(3000, var1, 0);
      (new net.w.m()).K(this.h, new Random(), var1);
   }

   private void L(boolean var1) {
      net.w.e var2 = new net.w.e(var1);
      if(this.e == null) {
         for(this.e = this.h.D(net.w.e.z).b(); this.h.Z(this.e).Q() == net.nb.f.T8 && this.e.h() > this.h.k(); this.e = this.e.b()) {
            ;
         }
      }

      var2.K(this.h, new Random(), this.e);
   }

   private net.a.t j() {
      this.h.d((j)(new j(0, 128, 0)));
      net.a.t var1 = new net.a.t(this.h);
      var1.c().D(net.nw.v.z);
      var1.S(0.0D, 128.0D, 0.0D, this.h.G.nextFloat() * 360.0F, 0.0F);
      this.h.S(var1);
      this.L = var1.O();
      return var1;
   }

   public void j(net.a.t var1) {
      if(var1.O().equals(this.L)) {
         this.I.n(var1.h() / var1.w());
         this.y = 0;
         if(var1.H()) {
            this.I.T(var1.b());
         }
      }

   }

   public int w() {
      return this.n;
   }

   public void B(net.nm.j var1, net.yz.z var2) {
      if(this.F != null && this.i.contains(var1)) {
         u.debug("Aborting respawn sequence");
         this.F = null;
         this.l = 0;
         this.I();
         this.L(true);
      } else {
         this.a();
         l var3 = this.h.O(this.L);
         if(var3 instanceof net.a.t) {
            ((net.a.t)var3).B(var1, new j(var1), var2);
         }
      }

   }

   public boolean O() {
      return this.A;
   }

   public void J() {
      if(this.U && this.F == null) {
         j var1 = this.e;
         u.debug("Tried to respawn, but need to find the portal first.");
         t.q var2 = this.u();
         u.debug("Couldn\'t find a portal, so we made one.");
         this.L(true);
         var1 = this.e;
         ArrayList var8 = Lists.newArrayList();
         j var3 = var1.J(1);

         for(aq var5 : aq.u.HORIZONTAL) {
            List var6 = this.h.p(net.nm.j.class, new net.u.e(var3.a(var5, 2)));
            if(var6.isEmpty()) {
               return;
            }

            var8.addAll(var6);
         }

         u.debug("Found all crystals, respawning dragon.");
         this.X(var8);
      }

   }

   private void X(List var1) {
      if(this.U && this.F == null) {
         t.q var2 = this.u();

         while(true) {
            for(int var3 = 0; var3 < this.a.u(); ++var3) {
               for(int var4 = 0; var4 < this.a.R(); ++var4) {
                  for(int var5 = 0; var5 < this.a.s(); ++var5) {
                     w var6 = var2.v(var3, var4, var5);
                     if(var6.J().Q() == net.nb.f.T8 || var6.J().Q() == net.nb.f.TG) {
                        this.h.U(var6.X(), net.nb.f.Tz.p());
                     }
                  }
               }
            }

            var2 = this.u();
         }
      }

   }

   public void I() {
      for(f8.i var4 : m.d(this.h)) {
         for(net.nm.j var6 : this.h.p(net.nm.j.class, var4.y())) {
            var6.T(false);
            var6.x((j)null);
         }
      }

   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
