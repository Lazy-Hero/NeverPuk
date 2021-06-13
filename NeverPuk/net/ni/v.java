package net.ni;

import javax.annotation.Nullable;
import net.ni.b;
import net.ni.c;
import net.ni.d;
import net.ni.e;
import net.ni.g;
import net.ni.h;
import net.ni.i;
import net.ni.j;
import net.ni.k;
import net.ni.l;
import net.ni.m;
import net.ni.n;
import net.ni.o;
import net.ni.p;
import net.ni.q;
import net.ni.s0;
import net.ni.sg;
import net.ni.sl;
import net.ni.su;
import net.ni.t;
import net.ni.u;
import net.ni.w;
import net.ni.x;
import net.ni.y;
import net.y9.zq;
import net.yz.ax;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class v {
   private static final Logger a = LogManager.getLogger();
   private static final net.c.d U = new net.c.d();
   protected net.yv.r J;
   protected net.u.j S = net.u.j.V;
   protected boolean l;
   private int Q = -1;
   protected net.y9.l D;
   private static boolean o;

   private static void x(String var0, Class var1) {
      U.H(new m_(var0), var1);
   }

   @Nullable
   public static m_ p(Class var0) {
      return (m_)U.t(var0);
   }

   public net.yv.r B() {
      return this.J;
   }

   public void k(net.yv.r var1) {
      this.J = var1;
   }

   public boolean j() {
      return this.J != null;
   }

   public void G(net.nj.f var1) {
      this.S = new net.u.j(var1.P("x"), var1.P("y"), var1.P("z"));
   }

   public net.nj.f b(net.nj.f var1) {
      return this.Q(var1);
   }

   private net.nj.f Q(net.nj.f var1) {
      w.C();
      m_ var3 = (m_)U.t(this.getClass());
      throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
   }

   @Nullable
   public static v c(net.yv.r var0, net.nj.f var1) {
      w.C();
      v var3 = null;
      String var4 = var1.J("id");
      Class var5 = (Class)U.B(new m_(var4));
      if(var5 != null) {
         var3 = (v)var5.newInstance();
      }

      if(var3 != null) {
         var3.Y(var0);
         var3.G(var1);
      } else {
         a.warn("Skipping BlockEntity with id {}", var4);
      }

      return var3;
   }

   protected void Y(net.yv.r var1) {
   }

   public int B() {
      if(this.Q == -1) {
         net.yw.n var1 = this.J.Z(this.S);
         this.Q = var1.Q().d(var1);
      }

      return this.Q;
   }

   public void W() {
      if(this.J != null) {
         net.yw.n var1 = this.J.Z(this.S);
         this.Q = var1.Q().d(var1);
         this.J.S(this.S, this);
         if(this.a() != net.nb.f.ou) {
            this.J.Z(this.S, this.a());
         }
      }

   }

   public double Q(double var1, double var3, double var5) {
      double var7 = (double)this.S.t() + 0.5D - var1;
      double var9 = (double)this.S.h() + 0.5D - var3;
      double var11 = (double)this.S.y() + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double K() {
      return 4096.0D;
   }

   public net.u.j C() {
      return this.S;
   }

   public net.y9.l a() {
      if(this.D == null && this.J != null) {
         this.D = this.J.Z(this.S).Q();
      }

      return this.D;
   }

   @Nullable
   public net.no.k q() {
      return null;
   }

   public net.nj.f e() {
      return this.Q(new net.nj.f());
   }

   public boolean n() {
      return this.l;
   }

   public void Z() {
      this.l = true;
   }

   public void Q() {
      this.l = false;
   }

   public boolean q(int var1, int var2) {
      return false;
   }

   public void K() {
      this.D = null;
      this.Q = -1;
   }

   public void w(net.d.l var1) {
      var1.L("Name", new net.d.t() {
         public String z() throws Exception {
            return v.U.t(v.this.getClass()) + " // " + v.this.getClass().getCanonicalName();
         }
      });
      if(this.J != null) {
         net.d.l.n(var1, this.S, this.a(), this.B());
         var1.L("Actual block type", new net.d.t() {
            public String p() throws Exception {
               int var1 = net.y9.l.h(v.this.J.Z(v.this.S).Q());
               return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(var1), net.y9.l.I(var1).j(), net.y9.l.I(var1).getClass().getCanonicalName()});
            }
         });
         var1.L("Actual block data value", new net.d.t() {
            public String z() throws Exception {
               net.yw.n var1 = v.this.J.Z(v.this.S);
               int var2 = var1.Q().d(var1);
               return "Unknown? (Got " + var2 + ")";
            }

            private static Exception a(Exception var0) {
               return var0;
            }
         });
      }

   }

   public void h(net.u.j var1) {
      this.S = var1.F();
   }

   public boolean u() {
      return false;
   }

   @Nullable
   public net.cb.t b() {
      return null;
   }

   public void v(net.yz.l var1) {
   }

   public void w(ax var1) {
   }

   static {
      Q(false);
      x("furnace", l.class);
      x("chest", k.class);
      x("ender_chest", n.class);
      x("jukebox", zq.a.class);
      x("dispenser", p.class);
      x("dropper", x.class);
      x("sign", sg.class);
      x("mob_spawner", u.class);
      x("noteblock", d.class);
      x("piston", su.class);
      x("brewing_stand", o.class);
      x("enchanting_table", j.class);
      x("end_portal", c.class);
      x("beacon", h.class);
      x("skull", s0.class);
      x("daylight_detector", b.class);
      x("hopper", i.class);
      x("comparator", t.class);
      x("flower_pot", m.class);
      x("banner", g.class);
      x("structure_block", sl.class);
      x("end_gateway", net.ni.z.class);
      x("command_block", q.class);
      x("shulker_box", e.class);
      x("bed", y.class);
   }

   public static void Q(boolean var0) {
      o = var0;
   }

   public static boolean R() {
      return o;
   }

   public static boolean A() {
      boolean var0 = R();
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
