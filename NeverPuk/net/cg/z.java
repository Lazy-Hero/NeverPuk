package net.cg;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.nj.f;
import net.yv.o9;
import net.yv.p;
import net.yv.t;

public class z {
   private String F;
   private int M;
   private boolean D;
   public static final net.yv.l B = net.yv.l.NORMAL;
   private long r;
   private net.yv.j H;
   private String w;
   private int x;
   private int U;
   private int i;
   private long N;
   private long Q;
   private long X;
   private long e;
   private f K;
   private int m;
   private String P;
   private int c;
   private int a;
   private boolean q;
   private int d;
   private boolean A;
   private int L;
   private o9 p;
   private boolean s;
   private boolean Y;
   private boolean W;
   private boolean g;
   private net.yv.l T;
   private boolean V;
   private double o;
   private double E;
   private double t;
   private long z;
   private double R;
   private double y;
   private double S;
   private int j;
   private int n;
   private final Map k;
   private p f;
   private static boolean Z;

   protected z() {
      this.H = net.yv.j.R;
      this.w = "";
      this.t = 6.0E7D;
      this.y = 5.0D;
      this.S = 0.2D;
      this.j = 5;
      this.n = 15;
      this.k = Maps.newEnumMap(net.yv.h.class);
      this.f = new p();
   }

   public static void G(net.c0.d var0) {
      var0.U(net.c0.q.LEVEL, new net.c0.w() {
         public f X(net.c0.l var1, f var2, int var3) {
            boolean var4 = net.cg.z.V();
            if(var2.K("Player", 10)) {
               var2.K("Player", var1.w(net.c0.q.PLAYER, var2.o("Player"), var3));
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public z(f var1) {
      z();
      this.H = net.yv.j.R;
      this.w = "";
      this.t = 6.0E7D;
      this.y = 5.0D;
      this.S = 0.2D;
      this.j = 5;
      this.n = 15;
      this.k = Maps.newEnumMap(net.yv.h.class);
      this.f = new p();
      if(var1.K("Version", 10)) {
         f var3 = var1.o("Version");
         this.F = var3.J("Name");
         this.M = var3.P("Id");
         this.D = var3.i("Snapshot");
      }

      this.r = var1.P("RandomSeed");
      if(var1.K("generatorName", 8)) {
         String var6 = var1.J("generatorName");
         this.H = net.yv.j.X(var6);
         if(this.H == null) {
            this.H = net.yv.j.R;
            net.u.d.h(new net.u.d[3]);
         }

         if(this.H.z()) {
            int var4 = 0;
            if(var1.K("generatorVersion", 99)) {
               var4 = var1.P("generatorVersion");
            }

            this.H = this.H.U(var4);
         }

         if(var1.K("generatorOptions", 8)) {
            this.w = var1.J("generatorOptions");
         }
      }

      this.p = o9.M(var1.P("GameType"));
      if(var1.K("MapFeatures", 99)) {
         this.s = var1.i("MapFeatures");
      }

      this.s = true;
      this.x = var1.P("SpawnX");
      this.U = var1.P("SpawnY");
      this.i = var1.P("SpawnZ");
      this.N = var1.P("Time");
      if(var1.K("DayTime", 99)) {
         this.Q = var1.P("DayTime");
      }

      this.Q = this.N;
      this.X = var1.P("LastPlayed");
      this.e = var1.P("SizeOnDisk");
      this.P = var1.J("LevelName");
      this.c = var1.P("version");
      this.a = var1.P("clearWeatherTime");
      this.d = var1.P("rainTime");
      this.q = var1.i("raining");
      this.L = var1.P("thunderTime");
      this.A = var1.i("thundering");
      this.Y = var1.i("hardcore");
      if(var1.K("initialized", 99)) {
         this.g = var1.i("initialized");
      }

      this.g = true;
      if(var1.K("allowCommands", 99)) {
         this.W = var1.i("allowCommands");
      }

      this.W = this.p == o9.CREATIVE;
      if(var1.K("Player", 10)) {
         this.K = var1.o("Player");
         this.m = this.K.P("Dimension");
      }

      if(var1.K("GameRules", 10)) {
         this.f.p(var1.o("GameRules"));
      }

      if(var1.K("Difficulty", 99)) {
         this.T = net.yv.l.w(var1.R("Difficulty"));
      }

      if(var1.K("DifficultyLocked", 1)) {
         this.V = var1.i("DifficultyLocked");
      }

      if(var1.K("BorderCenterX", 99)) {
         this.o = var1.g("BorderCenterX");
      }

      if(var1.K("BorderCenterZ", 99)) {
         this.E = var1.g("BorderCenterZ");
      }

      if(var1.K("BorderSize", 99)) {
         this.t = var1.g("BorderSize");
      }

      if(var1.K("BorderSizeLerpTime", 99)) {
         this.z = var1.P("BorderSizeLerpTime");
      }

      if(var1.K("BorderSizeLerpTarget", 99)) {
         this.R = var1.g("BorderSizeLerpTarget");
      }

      if(var1.K("BorderSafeZone", 99)) {
         this.y = var1.g("BorderSafeZone");
      }

      if(var1.K("BorderDamagePerBlock", 99)) {
         this.S = var1.g("BorderDamagePerBlock");
      }

      if(var1.K("BorderWarningBlocks", 99)) {
         this.j = var1.P("BorderWarningBlocks");
      }

      if(var1.K("BorderWarningTime", 99)) {
         this.n = var1.P("BorderWarningTime");
      }

      if(var1.K("DimensionData", 10)) {
         f var7 = var1.o("DimensionData");
         Iterator var8 = var7.b().iterator();
         if(var8.hasNext()) {
            String var5 = (String)var8.next();
            this.k.put(net.yv.h.M(Integer.parseInt(var5)), var7.o(var5));
         }
      }

   }

   public z(t var1, String var2) {
      this.H = net.yv.j.R;
      this.w = "";
      this.t = 6.0E7D;
      this.y = 5.0D;
      this.S = 0.2D;
      this.j = 5;
      this.n = 15;
      this.k = Maps.newEnumMap(net.yv.h.class);
      this.f = new p();
      this.i(var1);
      this.P = var2;
      this.T = B;
      this.g = false;
   }

   public void i(t var1) {
      this.r = var1.r();
      this.p = var1.H();
      this.s = var1.i();
      this.Y = var1.h();
      this.H = var1.H();
      this.w = var1.T();
      this.W = var1.Y();
   }

   public z(net.cg.z var1) {
      this.H = net.yv.j.R;
      this.w = "";
      this.t = 6.0E7D;
      this.y = 5.0D;
      this.S = 0.2D;
      this.j = 5;
      this.n = 15;
      this.k = Maps.newEnumMap(net.yv.h.class);
      this.f = new p();
      this.r = var1.r;
      this.H = var1.H;
      this.w = var1.w;
      this.p = var1.p;
      this.s = var1.s;
      this.x = var1.x;
      this.U = var1.U;
      this.i = var1.i;
      this.N = var1.N;
      this.Q = var1.Q;
      this.X = var1.X;
      this.e = var1.e;
      this.K = var1.K;
      this.m = var1.m;
      this.P = var1.P;
      this.c = var1.c;
      this.d = var1.d;
      this.q = var1.q;
      this.L = var1.L;
      this.A = var1.A;
      this.Y = var1.Y;
      this.W = var1.W;
      this.g = var1.g;
      this.f = var1.f;
      this.T = var1.T;
      this.V = var1.V;
      this.o = var1.o;
      this.E = var1.E;
      this.t = var1.t;
      this.z = var1.z;
      this.R = var1.R;
      this.y = var1.y;
      this.S = var1.S;
      this.n = var1.n;
      this.j = var1.j;
   }

   public f M(@Nullable f var1) {
      var1 = this.K;
      f var2 = new f();
      this.s(var2, var1);
      return var2;
   }

   private void s(f var1, f var2) {
      f var3 = new f();
      var3.b("Name", "1.12.2");
      var3.r("Id", 1343);
      var3.c("Snapshot", false);
      var1.K("Version", var3);
      var1.r("DataVersion", 1343);
      var1.V("RandomSeed", this.r);
      var1.b("generatorName", this.H.H());
      var1.r("generatorVersion", this.H.w());
      var1.b("generatorOptions", this.w);
      var1.r("GameType", this.p.x());
      var1.c("MapFeatures", this.s);
      var1.r("SpawnX", this.x);
      var1.r("SpawnY", this.U);
      var1.r("SpawnZ", this.i);
      var1.V("Time", this.N);
      var1.V("DayTime", this.Q);
      var1.V("SizeOnDisk", this.e);
      var1.V("LastPlayed", net.nx.f.X());
      var1.b("LevelName", this.P);
      var1.r("version", this.c);
      var1.r("clearWeatherTime", this.a);
      var1.r("rainTime", this.d);
      var1.c("raining", this.q);
      var1.r("thunderTime", this.L);
      var1.c("thundering", this.A);
      var1.c("hardcore", this.Y);
      var1.c("allowCommands", this.W);
      var1.c("initialized", this.g);
      var1.a("BorderCenterX", this.o);
      var1.a("BorderCenterZ", this.E);
      var1.a("BorderSize", this.t);
      var1.V("BorderSizeLerpTime", this.z);
      var1.a("BorderSafeZone", this.y);
      var1.a("BorderDamagePerBlock", this.S);
      var1.a("BorderSizeLerpTarget", this.R);
      var1.a("BorderWarningBlocks", (double)this.j);
      var1.a("BorderWarningTime", (double)this.n);
      if(this.T != null) {
         var1.D("Difficulty", (byte)this.T.L());
      }

      var1.c("DifficultyLocked", this.V);
      var1.K("GameRules", this.f.i());
      f var4 = new f();

      for(Entry var6 : this.k.entrySet()) {
         var4.K(String.valueOf(((net.yv.h)var6.getKey()).M()), (net.nj.q)var6.getValue());
      }

      var1.K("DimensionData", var4);
      var1.K("Player", var2);
   }

   public long D() {
      return this.r;
   }

   public int h() {
      return this.x;
   }

   public int o() {
      return this.U;
   }

   public int Q() {
      return this.i;
   }

   public long m() {
      return this.N;
   }

   public long A() {
      return this.Q;
   }

   public long v() {
      return this.e;
   }

   public f s() {
      return this.K;
   }

   public void r(int var1) {
      this.x = var1;
   }

   public void C(int var1) {
      this.U = var1;
   }

   public void l(int var1) {
      this.i = var1;
   }

   public void q(long var1) {
      this.N = var1;
   }

   public void l(long var1) {
      this.Q = var1;
   }

   public void n(net.u.j var1) {
      this.x = var1.t();
      this.U = var1.h();
      this.i = var1.y();
   }

   public String M() {
      return this.P;
   }

   public void I(String var1) {
      this.P = var1;
   }

   public int t() {
      return this.c;
   }

   public void z(int var1) {
      this.c = var1;
   }

   public long x() {
      return this.X;
   }

   public int Z() {
      return this.a;
   }

   public void d(int var1) {
      this.a = var1;
   }

   public boolean r() {
      return this.A;
   }

   public void p(boolean var1) {
      this.A = var1;
   }

   public int B() {
      return this.L;
   }

   public void H(int var1) {
      this.L = var1;
   }

   public boolean l() {
      return this.q;
   }

   public void d(boolean var1) {
      this.q = var1;
   }

   public int L() {
      return this.d;
   }

   public void P(int var1) {
      this.d = var1;
   }

   public o9 h() {
      return this.p;
   }

   public boolean X() {
      return this.s;
   }

   public void h(boolean var1) {
      this.s = var1;
   }

   public void D(o9 var1) {
      this.p = var1;
   }

   public boolean b() {
      return this.Y;
   }

   public void O(boolean var1) {
      this.Y = var1;
   }

   public net.yv.j h() {
      return this.H;
   }

   public void N(net.yv.j var1) {
      this.H = var1;
   }

   public String X() {
      return this.w == null?"":this.w;
   }

   public boolean u() {
      return this.W;
   }

   public void n(boolean var1) {
      this.W = var1;
   }

   public boolean Q() {
      return this.g;
   }

   public void H(boolean var1) {
      this.g = var1;
   }

   public p Z() {
      return this.f;
   }

   public double H() {
      return this.o;
   }

   public double s() {
      return this.E;
   }

   public double x() {
      return this.t;
   }

   public void C(double var1) {
      this.t = var1;
   }

   public long t() {
      return this.z;
   }

   public void n(long var1) {
      this.z = var1;
   }

   public double G() {
      return this.R;
   }

   public void y(double var1) {
      this.R = var1;
   }

   public void Y(double var1) {
      this.E = var1;
   }

   public void e(double var1) {
      this.o = var1;
   }

   public double t() {
      return this.y;
   }

   public void f(double var1) {
      this.y = var1;
   }

   public double B() {
      return this.S;
   }

   public void N(double var1) {
      this.S = var1;
   }

   public int i() {
      return this.j;
   }

   public int w() {
      return this.n;
   }

   public void I(int var1) {
      this.j = var1;
   }

   public void E(int var1) {
      this.n = var1;
   }

   public net.yv.l k() {
      return this.T;
   }

   public void b(net.yv.l var1) {
      this.T = var1;
   }

   public boolean s() {
      return this.V;
   }

   public void k(boolean var1) {
      this.V = var1;
   }

   public void O(net.d.l var1) {
      var1.L("Level seed", new net.d.t() {
         public String J() throws Exception {
            return String.valueOf(z.this.D());
         }
      });
      var1.L("Level generator", new net.d.t() {
         public String v() throws Exception {
            return String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[]{Integer.valueOf(z.this.H.N()), z.this.H.H(), Integer.valueOf(z.this.H.w()), Boolean.valueOf(z.this.s)});
         }
      });
      var1.L("Level generator options", new net.d.t() {
         public String B() throws Exception {
            return z.this.w;
         }
      });
      var1.L("Level spawn location", new net.d.t() {
         public String S() throws Exception {
            return net.d.l.U(z.this.x, z.this.U, z.this.i);
         }
      });
      var1.L("Level time", new net.d.t() {
         public String D() throws Exception {
            return String.format("%d game time, %d day time", new Object[]{Long.valueOf(z.this.N), Long.valueOf(z.this.Q)});
         }
      });
      var1.L("Level dimension", new net.d.t() {
         public String y() throws Exception {
            return String.valueOf(z.this.m);
         }
      });
      var1.L("Level storage version", new net.d.t() {
         public String q() throws Exception {
            net.cg.z.V();
            String var2 = "Unknown?";
            switch(z.this.c) {
            case 19132:
               var2 = "McRegion";
            case 19133:
               var2 = "Anvil";
            default:
               return String.format("0x%05X - %s", new Object[]{Integer.valueOf(z.this.c), var2});
            }
         }

         private static Throwable a(Throwable var0) {
            return var0;
         }
      });
      var1.L("Level weather", new net.d.t() {
         public String Q() throws Exception {
            return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[]{Integer.valueOf(z.this.d), Boolean.valueOf(z.this.q), Integer.valueOf(z.this.L), Boolean.valueOf(z.this.A)});
         }
      });
      var1.L("Level game mode", new net.d.t() {
         public String j() throws Exception {
            return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[]{z.this.p.t(), Integer.valueOf(z.this.p.x()), Boolean.valueOf(z.this.Y), Boolean.valueOf(z.this.W)});
         }
      });
   }

   public f k(net.yv.h var1) {
      f var2 = (f)this.k.get(var1);
      return new f();
   }

   public void x(net.yv.h var1, f var2) {
      this.k.put(var1, var2);
   }

   public int G() {
      return this.M;
   }

   public boolean p() {
      return this.D;
   }

   public String r() {
      return this.F;
   }

   static {
      x(true);
   }

   public static void x(boolean var0) {
      Z = var0;
   }

   public static boolean z() {
      return Z;
   }

   public static boolean V() {
      boolean var0 = z();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
