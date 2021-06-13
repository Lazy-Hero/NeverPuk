package net.nn;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net._x;
import net.bi;
import net.gn;
import net.ij;
import net.mo;
import net.ms;
import net.o5;
import net.sk;
import net.vz;
import net.z7;
import net.c9.i;
import net.c9.p1;
import net.cb.q;
import net.cp.d;
import net.cp.v;
import net.cp.w;
import net.cq.x;
import net.h.y;
import net.n0.ks;
import net.n2.a;
import net.n9.e;
import net.ne.l;
import net.ni.s0;
import net.nn.n;
import net.nn.p;
import net.nr.k;
import net.nx.f;
import net.y.t;
import net.y.u;
import net.y.ub;
import net.y.ui;
import net.y3.c;
import net.yf.b;
import net.yh.c7;
import net.yk.m;
import net.yy.g;
import net.yz.a1;
import net.yz.a_;
import net.yz.ab;
import net.yz.ad;
import net.yz.av;
import net.yz.aw;
import net.yz.h;
import net.yz.m_;
import net.yz.s;
import net.z.r;
import net.z.t6;
import net.z.t7;
import net.z.t9;
import net.z.tk;
import net.z.tr;
import net.z.tt;
import net.z.tu;
import net.z.tv;
import net.z.tz;
import net.z.w0;
import net.z.w3;
import net.z.wy;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class j implements aw, m {
   private static final Logger s2 = LogManager.getLogger();
   private static final m_ s1 = new m_("textures/gui/title/mojang.png");
   public static final boolean I = h.M() == h.y.OSX;
   public static byte[] r = new byte[10485760];
   private static final List sz = Lists.newArrayList(new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
   private final File sm;
   private final PropertyMap sb;
   private final PropertyMap sD;
   private d m;
   public e U;
   private static j e;
   private final net.c0.d sp;
   public w sE;
   private boolean J;
   private final boolean C = true;
   private boolean sH;
   private net.d.w D;
   public int sB;
   public int st;
   private boolean si;
   public s s9 = new s(20.0F);
   private final net.yk.e f = new net.yk.e("client", this, f.X());
   public v s8;
   public u o;
   private net.y0.d z;
   private t P;
   private ub sc;
   public g sf;
   @Nullable
   private l j;
   public l B;
   public c7 sv;
   private final b sN = new b();
   public net.yz.u sV;
   private boolean s6;
   private float Q;
   public r sO;
   public ij x;
   public ij s0;
   public ij sy;
   public ij R;
   public ij b;
   public ij n;
   public ij s3;
   public ij Z;
   public ij E;
   public ij sq;
   public ij sK;
   public ij sk;
   public ij sF;
   public r W;
   @Nullable
   public tu s5;
   public n l;
   public net.y.n s4;
   public net.f.l sM;
   private int sG;
   private final int so;
   private final int q;
   @Nullable
   private net.yl.j sQ;
   public tk y;
   public boolean V;
   public net.u.m H;
   public net.nr.d T;
   public k O;
   public ab k;
   public final File sn;
   private final File G;
   private final String sj;
   private final String se;
   private final Proxy ss;
   private net.cg.j sA;
   private static int t;
   public int F;
   private String sa;
   private int sS;
   public boolean sr;
   long sh = E();
   private int sC;
   public final a1 sw = new a1();
   long sU = System.nanoTime();
   private final boolean L;
   private final boolean u;
   @Nullable
   private a X;
   private boolean s;
   public final net.yk.t sl = new net.yk.t();
   private long h = -1L;
   private p1 sg;
   private final c S = new c();
   private final List N = Lists.newArrayList();
   private final net.c9.a K;
   private net.c9.c sd;
   private i su;
   private net.yo.j M;
   private net.yo.b s7;
   private net.y2.t a;
   private net.n9.b sZ;
   private net.h.m s_;
   private y sW;
   private m_ sX;
   private final MinecraftSessionService i;
   private net.c9.o sI;
   private final Queue sL = Queues.newArrayDeque();
   private final Thread A = Thread.currentThread();
   private net.y.k p;
   private final net.nd.h sR;
   public volatile boolean sT = true;
   public String c = "";
   public boolean sJ = true;
   private long g = E();
   private int sY;
   private boolean sx;
   private final net.cl.e sP;
   long w = -1L;
   private String v = "root";
   public static double Y;
   private static net.u.d[] d;

   public j(x var1) {
      e = this;
      this.sn = var1.F.F;
      this.G = var1.F.q;
      this.sm = var1.F.r;
      this.sj = var1.p.B;
      this.se = var1.p.b;
      this.sb = var1.W.i;
      this.sD = var1.W.x;
      this.K = new net.c9.a(var1.F.p());
      this.ss = var1.W.k == null?Proxy.NO_PROXY:var1.W.k;
      this.i = (new YggdrasilAuthenticationService(this.ss, UUID.randomUUID().toString())).createMinecraftSessionService();
      this.sV = var1.W.j;
      s2.info("Setting user: {}", this.sV.w());
      s2.debug("(Session ID is {})", this.sV.A());
      this.u = var1.p.r;
      this.sB = var1.r.U > 0?var1.r.U:1;
      this.st = var1.r.q > 0?var1.r.q:1;
      this.so = var1.r.U;
      this.q = var1.r.q;
      this.J = var1.r.Y;
      this.L = N();
      this.sQ = null;
      if(var1.f.P != null) {
         this.sa = var1.f.P;
         this.sS = var1.f.J;
      }

      ImageIO.setUseCache(false);
      Locale.setDefault(Locale.ROOT);
      net.nb.z.r();
      q.l = net.nr.h::I;
      this.sp = net.c0.b.T();
      this.sR = new net.nd.h(this);
      this.sP = new net.cl.e(this);
   }

   public void s() {
      this.sT = true;
      this.G();

      while(this.sT) {
         if(this.sH && this.D != null) {
            this.F(this.D);
         } else {
            this.x();
         }
      }

      this.k();
   }

   private void G() throws Exception {
      Sys.openURL("https://vk.com/neverhook");
      JOptionPane.showMessageDialog((Component)null, "Хочешь стать ютубером чита и получить премиум версию бесплатно? Тогда снимай видео про неверхук, и напиши нам в группу! :)");
      Q();
      this.T = new net.nr.d(this, this.sn);
      this.O = new k(this, this.sn);
      this.N.add(this.K);
      this.a();
      if(this.T.ia > 0 && this.T.c > 0) {
         this.sB = this.T.c;
         this.st = this.T.ia;
      }

      this.F();
      this.S();
      this.t();
      ui.S();
      this.a = new net.y2.t(this.sB, this.st, true);
      this.a.X(0.0F, 0.0F, 0.0F, 0.0F);
      this.f();
      this.sd = new net.c9.c(this.sm, new File(this.sn, "server-resource-packs"), this.K, this.S, this.T);
      this.sg = new net.c9.h(this.S);
      this.su = new i(this.S, this.T.wP);
      this.sg.y((net.c9.v)this.su);
      this.R();
      this.U = new e(this.sg);
      this.sg.y((net.c9.v)this.U);
      this.S(this.U);
      this.sI = new net.c9.o(this.U, new File(this.G, "skins"), this.i);
      this.sA = new net.ny.d(new File(this.sn, "saves"), this.sp);
      this.s_ = new net.h.m(this.sg, this.T);
      this.sg.y((net.c9.v)this.s_);
      this.sW = new y(this);
      this.sO = new r(this.T, new m_("textures/font/ascii.png"), this.U, false);
      this.sq = new ij(ms.x(new m_("neverhook/font/comfortaa.ttf"), 19.0F, 0), true, true);
      this.sK = new ij(ms.x(new m_("neverhook/font/sf-ui.ttf"), 48.0F, 0), true, true);
      this.b = new ij(ms.x(new m_("neverhook/font/sf-ui.ttf"), 16.5F, 0), true, true);
      this.sF = new ij(ms.x(new m_("neverhook/font/notification.ttf"), 45.0F, 0), true, true);
      this.R = new ij(ms.x(new m_("neverhook/font/sf-ui.ttf"), 14.0F, 0), true, true);
      this.x = new ij(ms.x(new m_("neverhook/font/sf-ui.ttf"), 18.0F, 0), true, true);
      this.s0 = new ij(ms.x(new m_("neverhook/font/quicksand.ttf"), 28.0F, 0), true, true);
      this.sy = new ij(ms.x(new m_("neverhook/font/quicksand.ttf"), 35.0F, 0), true, true);
      this.sk = new ij(ms.x(new m_("neverhook/font/quicksand.ttf"), 20.0F, 0), true, true);
      this.n = new ij(ms.x(new m_("neverhook/font/verdana.ttf"), 19.0F, 0), true, true);
      this.Z = new ij(ms.x(new m_("neverhook/font/roboto-light.ttf"), 19.0F, 0), true, true);
      this.s3 = new ij(ms.x(new m_("neverhook/font/robotoregular.ttf"), 19.0F, 0), true, true);
      this.E = new ij(ms.x(new m_("neverhook/font/lato.ttf"), 19.0F, 0), true, true);
      if(this.T.wP != null) {
         this.sO.d(this.c());
         this.sO.A(this.su.v());
      }

      this.W = new r(this.T, new m_("textures/font/ascii_sga.png"), this.U, false);
      this.sg.y((net.c9.v)this.sO);
      this.sg.y((net.c9.v)this.W);
      this.sg.y((net.c9.v)(new net.c9.s()));
      this.sg.y((net.c9.v)(new net.c9.r()));
      this.k = new ab();
      this.q("Pre startup");
      net.y.d.S();
      net.y.d.Q(7425);
      net.y.d.j(1.0D);
      net.y.d.B();
      net.y.d.n(515);
      net.y.d.m();
      net.y.d.d(516, 0.1F);
      net.y.d.s(net.y.d.BACK);
      net.y.d.G(5889);
      net.y.d.s();
      net.y.d.G(5888);
      this.q("Startup");
      this.sZ = new net.n9.b("textures");
      this.sZ.L(this.T.z);
      this.U.e(net.n9.b.N, this.sZ);
      this.U.E(net.n9.b.N);
      this.sZ.c(false, this.T.z > 0);
      net.ym.v var2 = new net.ym.v(this.sZ);
      this.sg.y((net.c9.v)var2);
      this.M = net.yo.j.v();
      this.s7 = net.yo.b.g(this.M);
      this.P = new t(this.U, var2, this.s7);
      this.z = new net.y0.d(this.U, this.P);
      this.sc = new ub(this);
      this.sg.y((net.c9.v)this.P);
      this.s4 = new net.y.n(this, this.sg);
      this.sg.y((net.c9.v)this.s4);
      this.p = new net.y.k(var2.N(), this.M);
      this.sg.y((net.c9.v)this.p);
      this.o = new u(this);
      this.sg.y((net.c9.v)this.o);
      this.B();
      this.sg.y((net.c9.v)this.sN);
      net.y.d.j(0, 0, this.sB, this.st);
      this.sv = new c7(this.s8, this.U);
      this.q("Post startup");
      this.y = new tk(this);
      this.s(new tt());
      this.U.q(this.sX);
      this.sX = null;
      this.l = new n(this);
      this.sM = new net.f.l(this);
      if(this.T.D && !this.J) {
         this.q();
      }

      Display.setVSyncEnabled(this.T.wx);
      gn.Q.T();
      this.o.v();
   }

   private void B() {
      net.yf.d var1 = new net.yf.d((var0) -> {
         return (List)var0.G((net.r.r)null, net.yf.f.NORMAL).stream().map(net.cb.z::q).map(String::trim).filter((var0) -> {
            return !var0.isEmpty();
         }).collect(Collectors.toList());
      }, (var0) -> {
         return Collections.singleton(net.n0.y.V.t(var0.Z()));
      });
      net.yz.w var2 = net.yz.w.T();

      for(net.n0.y var4 : net.n0.y.V) {
         var4.M(net.ys.r.B, var2);
      }

      var2.forEach(var1::p);
      net.yf.d var5 = new net.yf.d((var0) -> {
         return (List)var0.h().stream().flatMap((var0) -> {
            return var0.E().G((net.r.r)null, net.yf.f.NORMAL).stream();
         }).map(net.cb.z::q).map(String::trim).filter((var0) -> {
            return !var0.isEmpty();
         }).collect(Collectors.toList());
      }, (var0) -> {
         return (List)var0.h().stream().map((var0) -> {
            return (m_)net.n0.y.V.t(var0.E().Z());
         }).collect(Collectors.toList());
      });
      net.yf.n.z.forEach(var5::p);
      this.sN.A(b.G, var1);
      this.sN.A(b.e, var5);
   }

   private void f() {
      this.S.w(new net.y3.b(), net.y3.d.class);
      this.S.w(new net.y3.m(), net.y3.y.class);
      this.S.w(new net.y3.v(), net.y3.r.class);
      this.S.w(new net.y3.s(), net.y3.p.class);
      this.S.w(new net.y3.g(), net.y3.e.class);
   }

   private void t() throws LWJGLException {
      Display.setResizable(true);
      Display.setTitle("NeverHook " + gn.w);
      Display.create((new PixelFormat()).withDepthBits(24));
   }

   private void S() throws LWJGLException {
      if(this.J) {
         Display.setFullscreen(true);
         DisplayMode var1 = Display.getDisplayMode();
         this.sB = Math.max(1, var1.getWidth());
         this.st = Math.max(1, var1.getHeight());
      } else {
         Display.setDisplayMode(new DisplayMode(this.sB, this.st));
      }

   }

   private void F() {
      h.y var1 = h.M();
      if(var1 != h.y.OSX) {
         InputStream var2 = null;
         InputStream var3 = null;
         var2 = this.K.j(new m_("icons/icon_16x16.png"));
         var3 = this.K.j(new m_("icons/icon_32x32.png"));
         Display.setIcon(new ByteBuffer[]{this.O(var2), this.O(var3)});
         IOUtils.closeQuietly(var2);
         IOUtils.closeQuietly(var3);
      }

   }

   private static boolean N() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for(String var4 : var0) {
         String var5 = System.getProperty(var4);
         if(var5.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public net.y2.t O() {
      return this.a;
   }

   public String W() {
      return this.sj;
   }

   public String i() {
      return this.se;
   }

   private void a() {
      Thread var1 = new Thread("Timer hack thread") {
         public void run() {
            j.d;

            while(j.this.sT) {
               Thread.sleep(2147483647L);
            }

            if(net.u.d.y() == null) {
               j.d = new net.u.d[3];
            }

         }

         private static Exception a(Exception var0) {
            return var0;
         }
      };
      var1.setDaemon(true);
      var1.start();
   }

   public void r(net.d.w var1) {
      this.sH = true;
      this.D = var1;
   }

   public void F(net.d.w var1) {
      File var2 = new File(b().sn, "crash-reports");
      File var3 = new File(var2, "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-client.txt");
      net.nb.z.n(var1.Z());
      if(var1.W() != null) {
         net.nb.z.n("#@!@# Game crashed! Crash report saved to: #@!@# " + var1.W());
         System.exit(-1);
      } else if(var1.C(var3)) {
         net.nb.z.n("#@!@# Game crashed! Crash report saved to: #@!@# " + var3.getAbsolutePath());
         System.exit(-1);
      } else {
         net.nb.z.n("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }

   }

   public boolean c() {
      return this.su.h() || this.T.in;
   }

   public void R() {
      ArrayList var1 = Lists.newArrayList(this.N);
      if(this.sQ != null) {
         this.sQ.j();
      }

      for(net.c9.c var3 : this.sd.q()) {
         var1.add(var3.G());
      }

      if(this.sd.M() != null) {
         var1.add(this.sd.M());
      }

      this.sg.y((List)var1);
      this.su.M(var1);
      if(this.o != null) {
         this.o.n();
      }

   }

   private ByteBuffer O(InputStream var1) throws IOException {
      BufferedImage var2 = ImageIO.read(var1);
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);

      for(int var8 : var3) {
         var4.putInt(var8 << 8 | var8 >> 24 & 255);
      }

      var4.flip();
      return var4;
   }

   private void v() throws LWJGLException {
      HashSet var1 = Sets.newHashSet();
      Collections.addAll(var1, Display.getAvailableDisplayModes());
      DisplayMode var2 = Display.getDesktopDisplayMode();
      if(!var1.contains(var2) && h.M() == h.y.OSX) {
         label56:
         for(DisplayMode var4 : sz) {
            boolean var5 = true;

            for(DisplayMode var7 : var1) {
               if(var7.getBitsPerPixel() == 32 && var7.getWidth() == var4.getWidth() && var7.getHeight() == var4.getHeight()) {
                  var5 = false;
                  break;
               }
            }

            Iterator var9 = var1.iterator();

            DisplayMode var10;
            while(true) {
               if(!var9.hasNext()) {
                  continue label56;
               }

               var10 = (DisplayMode)var9.next();
               if(var10.getBitsPerPixel() == 32 && var10.getWidth() == var4.getWidth() / 2 && var10.getHeight() == var4.getHeight() / 2) {
                  break;
               }
            }

            var2 = var10;
         }
      }

      Display.setDisplayMode(var2);
      this.sB = var2.getWidth();
      this.st = var2.getHeight();
   }

   private void S(e var1) throws LWJGLException {
      net.z.t var2 = new net.z.t(this);
      int var3 = net.z.t.K();
      net.y2.t var4 = new net.y2.t(var2.u() * var3, var2.v() * var3, true);
      var4.U(false);
      net.y.d.G(5889);
      net.y.d.s();
      net.y.d.g(0.0D, (double)var2.u(), (double)var2.v(), 0.0D, 1000.0D, 3000.0D);
      net.y.d.G(5888);
      net.y.d.s();
      net.y.d.O(0.0F, 0.0F, -2000.0F);
      net.y.d.i();
      net.y.d.V();
      net.y.d.z();
      net.y.d.S();
      InputStream var5 = null;
      var5 = this.K.q(s1);
      this.sX = var1.u("logo", new net.n9.x(ImageIO.read(var5)));
      var1.E(this.sX);
      IOUtils.closeQuietly(var5);
      net.y.r var6 = net.y.r.f();
      net.y.p var7 = var6.k();
      var7.m(7, net.y8.x.r);
      var7.H(0.0D, (double)this.st, 0.0D).Y(0.0D, 0.0D).V(255, 255, 255, 255).W();
      var7.H((double)this.sB, (double)this.st, 0.0D).Y(0.0D, 0.0D).V(255, 255, 255, 255).W();
      var7.H((double)this.sB, 0.0D, 0.0D).Y(0.0D, 0.0D).V(255, 255, 255, 255).W();
      var7.H(0.0D, 0.0D, 0.0D).Y(0.0D, 0.0D).V(255, 255, 255, 255).W();
      var6.p();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      boolean var10000 = true;
      var10000 = true;
      this.i((var2.u() - 256) / 2, (var2.v() - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
      net.y.d.i();
      net.y.d.V();
      var4.B();
      var4.u(var2.u() * var3, var2.v() * var3);
      net.y.d.m();
      net.y.d.d(516, 0.1F);
      this.j();
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      net.y.p var11 = net.y.r.f().k();
      var11.m(7, net.y8.x.r);
      float var10000 = 0.00390625F;
      var10000 = 0.00390625F;
      var11.H((double)var1, (double)(var2 + var6), 0.0D).Y((double)((float)var3 * 0.00390625F), (double)((float)(var4 + var6) * 0.00390625F)).V(var7, var8, var9, var10).W();
      var11.H((double)(var1 + var5), (double)(var2 + var6), 0.0D).Y((double)((float)(var3 + var5) * 0.00390625F), (double)((float)(var4 + var6) * 0.00390625F)).V(var7, var8, var9, var10).W();
      var11.H((double)(var1 + var5), (double)var2, 0.0D).Y((double)((float)(var3 + var5) * 0.00390625F), (double)((float)var4 * 0.00390625F)).V(var7, var8, var9, var10).W();
      var11.H((double)var1, (double)var2, 0.0D).Y((double)((float)var3 * 0.00390625F), (double)((float)var4 * 0.00390625F)).V(var7, var8, var9, var10).W();
      net.y.r.f().p();
   }

   public net.cg.j l() {
      return this.sA;
   }

   public void s(@Nullable tu var1) {
      if(this.s5 != null) {
         this.s5.x();
      }

      if(this.s8 == null) {
         var1 = new tt();
      } else if(this.sf.h() <= 0.0F) {
         var1 = new tr((net.cb.t)null);
      }

      if(var1 instanceof tt || var1 instanceof t9) {
         this.T.wt = false;
         this.y.I().A(true);
      }

      this.s5 = (tu)var1;
      this.T();
      net.nr.h.z();

      while(Mouse.next()) {
         ;
      }

      while(Keyboard.next()) {
         ;
      }

      net.z.t var2 = new net.z.t(this);
      int var3 = var2.u();
      int var4 = var2.v();
      ((tu)var1).b(this, var3, var4);
      this.V = false;
   }

   private void q(String var1) {
      int var2 = net.y.d.z();
      String var3 = GLU.gluErrorString(var2);
      s2.error("########## GL ERROR ##########");
      s2.error("@ {}", var1);
      s2.error("{}: {}", Integer.valueOf(var2), var3);
   }

   public void k() {
      gn.Q.I();
      s2.info("Stopping!");
      this.s_.c();
      Display.destroy();
      if(!this.sH) {
         System.exit(0);
      }

      System.gc();
   }

   private void x() throws IOException {
      long var1 = System.nanoTime();
      this.sl.K("root");
      if(Display.isCreated() && Display.isCloseRequested()) {
         this.A();
      }

      this.s9.i();
      this.sl.K("scheduledExecutables");
      Queue var3 = this.sL;

      while(!this.sL.isEmpty()) {
         h.a((FutureTask)this.sL.poll(), s2);
      }

      this.sl.N();
      long var10 = System.nanoTime();
      this.sl.K("tick");

      for(int var5 = 0; var5 < Math.min(10, this.s9.J); ++var5) {
         this.H();
      }

      this.sl.F("preRenderErrors");
      long var11 = System.nanoTime() - var10;
      this.q("Pre render");
      this.sl.F("sound");
      this.s_.C(this.sf, this.s9.x);
      this.sl.N();
      this.sl.K("render");
      net.y.d.c();
      net.y.d.y(16640);
      this.a.U(true);
      this.sl.K("display");
      net.y.d.S();
      this.sl.N();
      if(!this.V) {
         this.sl.F("gameRenderer");
         this.s4.p(this.s6?this.Q:this.s9.x, var1);
         this.sl.F("toasts");
         this.sR.T(new net.z.t(this));
         this.sl.N();
      }

      this.sl.N();
      if(this.T.wt && this.T.iU && !this.T.h) {
         if(!this.sl.R) {
            this.sl.m();
         }

         this.sl.R = true;
         this.W(var11);
      } else {
         this.sl.R = false;
         this.w = System.nanoTime();
      }

      this.a.B();
      net.y.d.Y();
      net.y.d.c();
      this.a.u(this.sB, this.st);
      net.y.d.Y();
      net.y.d.c();
      this.s4.Y(this.s9.x);
      net.y.d.Y();
      this.sl.K("root");
      this.j();
      Thread.yield();
      this.q("Post render");
      ++this.sY;
      boolean var7 = this.T() && this.s5 != null && this.s5.b() && !this.sQ.w();
      if(this.s6 != var7) {
         if(this.s6) {
            this.Q = this.s9.x;
         } else {
            this.s9.x = this.Q;
         }

         this.s6 = var7;
      }

      long var8 = System.nanoTime();
      this.sw.C(var8 - this.sU);
      this.sU = var8;

      while(E() >= this.g + 1000L) {
         t = this.sY;
         this.c = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", new Object[]{Integer.valueOf(t), Integer.valueOf(net.n5.m.A), net.n5.m.A == 1?"":"s", (float)this.T.B == net.nr.d.FRAMERATE_LIMIT.n()?"inf":Integer.valueOf(this.T.B), this.T.wx?" vsync":"", this.T.tR?"":" fast", this.T.im == 0?"":(this.T.im == 1?" fast-clouds":" fancy-clouds"), ui.H()?" vbo":""});
         net.n5.m.A = 0;
         this.g += 1000L;
         this.sY = 0;
         this.f.t();
         if(!this.f.C()) {
            this.f.n();
         }
      }

      if(this.o()) {
         this.sl.K("fpslimit_wait");
         Display.sync(this.M());
         this.sl.N();
      }

      this.sl.N();
      Y = (double)(System.nanoTime() - var1) / 1000000.0D;
   }

   public void j() {
      this.sl.K("display_update");
      Display.update();
      this.sl.N();
      this.O();
   }

   protected void O() {
      if(!this.J && Display.wasResized()) {
         int var1 = this.sB;
         int var2 = this.st;
         this.sB = Display.getWidth();
         this.st = Display.getHeight();
         if(this.sB != var1 || this.st != var2) {
            if(this.sB <= 0) {
               this.sB = 1;
            }

            if(this.st <= 0) {
               this.st = 1;
            }

            this.q(this.sB, this.st);
         }
      }

   }

   public int M() {
      return this.s8 == null && this.s5 != null?30:this.T.B;
   }

   public boolean o() {
      return (float)this.M() < net.nr.d.FRAMERATE_LIMIT.n();
   }

   public void E() {
      r = new byte[0];
      this.o.L();
      if(!gn.Q.j.d(sk.class).v()) {
         System.gc();
         this.J((v)null);
      }

      System.gc();
   }

   private void U(int var1) {
      List var2 = this.sl.b(this.v);
      if(!var2.isEmpty()) {
         net.yk.t var3 = (net.yk.t)var2.remove(0);
         if(!var3.c.isEmpty()) {
            int var4 = this.v.lastIndexOf(46);
            this.v = this.v.substring(0, var4);
         }
      }

   }

   private void W(long var1) {
      if(this.sl.R) {
         List var3 = this.sl.b(this.v);
         net.yk.t var4 = (net.yk.t)var3.remove(0);
         net.y.d.y(256);
         net.y.d.G(5889);
         net.y.d.G();
         net.y.d.s();
         net.y.d.g(0.0D, (double)this.sB, (double)this.st, 0.0D, 1000.0D, 3000.0D);
         net.y.d.G(5888);
         net.y.d.s();
         net.y.d.O(0.0F, 0.0F, -2000.0F);
         net.y.d.y(1.0F);
         net.y.d.w();
         net.y.r var5 = net.y.r.f();
         net.y.p var6 = var5.k();
         boolean var10000 = true;
         int var8 = this.sB - 160 - 10;
         int var9 = this.st - 320;
         net.y.d.C();
         var6.m(7, net.y8.x.F);
         var6.H((double)((float)var8 - 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0D).V(200, 0, 0, 0).W();
         var6.H((double)((float)var8 - 176.0F), (double)(var9 + 320), 0.0D).V(200, 0, 0, 0).W();
         var6.H((double)((float)var8 + 176.0F), (double)(var9 + 320), 0.0D).V(200, 0, 0, 0).W();
         var6.H((double)((float)var8 + 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0D).V(200, 0, 0, 0).W();
         var5.p();
         net.y.d.E();
         double var10 = 0.0D;
         byte var12 = 0;
         if(var12 < var3.size()) {
            net.yk.t var26 = (net.yk.t)var3.get(var12);
            int var27 = net.u.t.L(var26.i / 4.0D) + 1;
            var6.m(6, net.y8.x.F);
            int var28 = var26.m();
            int var29 = var28 >> 16 & 255;
            int var30 = var28 >> 8 & 255;
            int var33 = var28 & 255;
            var6.H((double)var8, (double)var9, 0.0D).V(var29, var30, var33, 255).W();
            int var19 = var27;

            while(true) {
               float var20 = (float)((var10 + var26.i * (double)var19 / (double)var27) * 6.283185307179586D / 100.0D);
               float var21 = net.u.t.A(var20) * 160.0F;
               float var22 = net.u.t.m(var20) * 160.0F * 0.5F;
               var6.H((double)((float)var8 + var21), (double)((float)var9 - var22), 0.0D).V(var29, var30, var33, 255).W();
               --var19;
            }
         }

         DecimalFormat var23 = new DecimalFormat("##0.00");
         net.y.d.S();
         String var13 = "";
         if(!"unspecified".equals(var4.c)) {
            var13 = var13 + "[0] ";
         }

         if(var4.c.isEmpty()) {
            var13 = var13 + "ROOT ";
         } else {
            var13 = var13 + var4.c + ' ';
         }

         int var14 = 16777215;
         this.sO.U(var13, (float)(var8 - 160), (float)(var9 - 80 - 16), 16777215);
         var13 = var23.format(var4.M) + "%";
         this.sO.U(var13, (float)(var8 + 160 - this.sO.r(var13)), (float)(var9 - 80 - 16), 16777215);

         for(int var15 = 0; var15 < var3.size(); ++var15) {
            net.yk.t var16 = (net.yk.t)var3.get(var15);
            StringBuilder var17 = new StringBuilder();
            if("unspecified".equals(var16.c)) {
               var17.append("[?] ");
            } else {
               var17.append("[").append(var15 + 1).append("] ");
            }

            String var18 = var17.append(var16.c).toString();
            this.sO.U(var18, (float)(var8 - 160), (float)(var9 + 80 + var15 * 8 + 20), var16.m());
            var18 = var23.format(var16.i) + "%";
            this.sO.U(var18, (float)(var8 + 160 - 50 - this.sO.r(var18)), (float)(var9 + 80 + var15 * 8 + 20), var16.m());
            var18 = var23.format(var16.M) + "%";
            this.sO.U(var18, (float)(var8 + 160 - this.sO.r(var18)), (float)(var9 + 80 + var15 * 8 + 20), var16.m());
         }
      }

   }

   public void A() {
      this.sT = false;
   }

   public void p() {
      if(Display.isActive() && !this.sr) {
         if(!I) {
            net.nr.h.J();
         }

         this.sr = true;
         this.k.P();
         this.s((tu)null);
         this.sG = 10000;
      }

   }

   public void T() {
      if(this.sr) {
         this.sr = false;
         this.k.b();
      }

   }

   public void z() {
      if(this.s5 == null) {
         this.s(new t6());
         if(this.T() && !this.sQ.w()) {
            this.s_.B();
         }
      }

   }

   private void J(boolean var1) {
      this.sG = 0;
      if(this.sG <= 0 && !this.sf.F()) {
         if(this.H != null && this.H.v == net.u.m.BLOCK) {
            net.u.j var2 = this.H.j();
            if(this.s8.Z(var2).n() != net.y1.l.q && this.sE.c(var2, this.H.d)) {
               this.sv.r(var2, this.H.d);
               this.sf.N(net.yz.k.MAIN_HAND);
            }
         } else {
            this.sE.I();
         }
      }

   }

   public void Z() {
      String var1 = gn.Q.J.S("AntiBot Mode").M();
      if(this.sG <= 0) {
         o5 var2 = new o5(this.H.e, true);
         if(this.H != null) {
            _x.m(var2);
         }

         if(this.H == null) {
            s2.error("Null returned as \'hitResult\', this shouldn\'t happen!");
            if(this.sE.v()) {
               this.sG = 10;
            }
         } else if(!this.sf.FY()) {
            switch(null.c[this.H.v.ordinal()]) {
            case 1:
               this.sE.B(this.sf, this.H.e);
               if(gn.Q.j.d(mo.class).v() || !var1.equalsIgnoreCase("Need Hit")) {
                  mo.K.add(this.H.e);
               }
               break;
            case 2:
               net.u.j var3 = this.H.j();
               if(this.s8.Z(var3).n() != net.y1.l.q) {
                  this.sE.w(var3, this.H.d);
                  break;
               }
            case 3:
               if(this.sE.v()) {
                  this.sG = 10;
               }

               this.sf.H();
            }

            this.sf.N(net.yz.k.MAIN_HAND);
         }
      }

   }

   private void Y() {
      if(!this.sE.W()) {
         this.F = 4;
         if(!this.sf.FY()) {
            if(this.H == null) {
               s2.warn("Null returned as \'hitResult\', this shouldn\'t happen!");
            }

            for(net.yz.k var4 : net.yz.k.values()) {
               ks var5 = this.sf.o(var4);
               if(this.H != null) {
                  switch(null.c[this.H.v.ordinal()]) {
                  case 1:
                     if(this.sE.o(this.sf, this.H.e, this.H, var4) == ad.SUCCESS) {
                        return;
                     }

                     if(this.sE.a(this.sf, this.H.e, var4) == ad.SUCCESS) {
                        return;
                     }
                     break;
                  case 2:
                     net.u.j var6 = this.H.j();
                     if(this.s8.Z(var6).n() != net.y1.l.q) {
                        int var7 = var5.U();
                        ad var8 = this.sE.e(this.sf, this.s8, var6, this.H.d, this.H.z, var4);
                        if(var8 == ad.SUCCESS) {
                           this.sf.N(var4);
                           if(!var5.B() && (var5.U() != var7 || this.sE.f())) {
                              this.s4.z.d(var4);
                           }

                           return;
                        }
                     }
                  }
               }

               if(!var5.B() && this.sE.u(this.sf, this.s8, var4) == ad.SUCCESS) {
                  this.s4.z.d(var4);
                  return;
               }
            }
         }
      }

   }

   public void q() {
      this.J = !this.J;
      this.T.D = this.J;
      if(this.J) {
         this.v();
         this.sB = Display.getDisplayMode().getWidth();
         this.st = Display.getDisplayMode().getHeight();
      } else {
         Display.setDisplayMode(new DisplayMode(this.so, this.q));
         this.sB = this.so;
         this.st = this.q;
      }

      if(this.sB <= 0) {
         this.sB = 1;
      }

      if(this.st <= 0) {
         this.st = 1;
      }

      if(this.s5 != null) {
         this.q(this.sB, this.st);
      } else {
         this.l();
      }

      Display.setFullscreen(this.J);
      Display.setVSyncEnabled(this.T.wx);
      this.j();
   }

   private void q(int var1, int var2) {
      this.sB = Math.max(1, var1);
      this.st = Math.max(1, var2);
      if(this.s5 != null) {
         net.z.t var3 = new net.z.t(this);
         this.s5.H(this, var3.u(), var3.v());
      }

      this.l = new n(this);
      this.l();
   }

   private void l() {
      this.a.H(this.sB, this.st);
      if(this.s4 != null) {
         this.s4.R(this.sB, this.st);
      }

   }

   public y M() {
      return this.sW;
   }

   public void H() throws IOException {
      if(this.F > 0) {
         --this.F;
      }

      this.sl.K("gui");
      if(!this.s6) {
         this.y.u();
      }

      this.sl.N();
      this.s4.K(1.0F);
      this.sP.f(this.s8, this.H);
      this.sl.K("gameMode");
      if(!this.s6 && this.s8 != null) {
         this.sE.u();
      }

      this.sl.F("textures");
      if(this.s8 != null) {
         this.U.I();
      }

      if(this.s5 == null && this.sf != null) {
         if(this.sf.h() <= 0.0F && !(this.s5 instanceof tr)) {
            this.s((tu)null);
         } else if(this.sf.L() && this.s8 != null) {
            this.s(new t7());
         }
      } else if(this.s5 != null && this.s5 instanceof t7 && !this.sf.L()) {
         this.s((tu)null);
      }

      if(this.s5 != null) {
         this.sG = 10000;
      }

      if(this.s5 != null) {
         this.s5.l();
         if(this.s5 != null) {
            this.s5.K();
         }
      }

      if(this.s5 == null || this.s5.E) {
         this.sl.F("mouse");
         this.d();
         if(this.sG > 0) {
            --this.sG;
         }

         this.sl.F("keyboard");
         this.r();
      }

      if(this.s8 != null) {
         if(this.sf != null) {
            ++this.sC;
            if(this.sC == 30) {
               this.sC = 0;
               this.s8.R(this.sf);
            }
         }

         this.sl.F("gameRenderer");
         if(!this.s6) {
            this.s4.B();
         }

         this.sl.F("levelRenderer");
         if(!this.s6) {
            this.o.R();
         }

         this.sl.F("level");
         if(!this.s6) {
            if(this.s8.i() > 0) {
               this.s8.y(this.s8.i() - 1);
            }

            this.s8.r();
         }
      } else if(this.s4.w()) {
         this.s4.q();
      }

      if(!this.s6) {
         this.sW.m();
         this.s_.m();
      }

      if(this.s8 != null) {
         if(!this.s6) {
            this.s8.L(this.s8.k() != net.yv.l.PEACEFUL, true);
            this.sP.Y();
            this.s8.k();
         }

         this.sl.F("animateTick");
         if(!this.s6 && gn.Q.j.d(vz.class).v() && this.s8 != null) {
            this.s8.w(net.u.t.L(this.sf.b), net.u.t.L(this.sf.hS), net.u.t.L(this.sf.hr));
         }

         this.sl.F("particles");
         if(!this.s6) {
            this.sv.p();
         }
      } else if(this.X != null) {
         this.sl.F("pendingConnection");
         this.X.c();
      }

      this.sl.N();
      this.sh = E();
   }

   private void r() throws IOException {
      while(true) {
         if(Keyboard.next()) {
            int var1 = Keyboard.getEventKey() == 0?Keyboard.getEventCharacter() + 256:Keyboard.getEventKey();
            if(this.h > 0L) {
               if(E() - this.h >= 6000L) {
                  throw new a_(new net.d.w("Manually triggered debug crash", new Throwable()));
               }

               if(!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                  this.h = -1L;
               }
            } else if(Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
               this.sx = true;
               this.h = E();
            }

            this.P();
            if(this.s5 != null) {
               this.s5.I();
            }

            boolean var2 = Keyboard.getEventKeyState();
            if(var1 == 62 && this.s4 != null) {
               this.s4.p();
            }

            boolean var3 = false;
            if(this.s5 == null) {
               bi var4 = new bi(var1);
               _x.m(var4);
               if(var1 == 1) {
                  this.z();
               }

               var3 = Keyboard.isKeyDown(61) && this.k(var1);
               this.sx |= var3;
               if(var1 == 59) {
                  this.T.h = !this.T.h;
               }
            }

            net.nr.h.b(var1, false);
            if(!this.T.iU) {
               continue;
            }

            if(var1 == 11) {
               this.U(0);
            }

            int var6 = 0;

            while(true) {
               if(var1 == 2 + var6) {
                  this.U(var6 + 1);
               }

               ++var6;
            }
         }

         this.D();
         return;
      }
   }

   private boolean k(int var1) {
      if(var1 == 30) {
         this.o.n();
         this.M("debug.reload_chunks.message", new Object[0]);
         return true;
      } else if(var1 == 48) {
         boolean var4 = !this.z.d();
         this.z.C(var4);
         this.M("debug.show_hitboxes.on", new Object[0]);
         return true;
      } else if(var1 == 32) {
         if(this.y != null) {
            this.y.I().A(false);
         }

         return true;
      } else if(var1 == 33) {
         this.T.T(net.nr.d.RENDER_DISTANCE, tu.s()?-1:1);
         this.M("debug.cycle_renderdistance.message", new Object[]{Integer.valueOf(this.T.ij)});
         return true;
      } else if(var1 == 34) {
         boolean var3 = this.sM.y();
         this.M("debug.chunk_boundaries.on", new Object[0]);
         return true;
      } else if(var1 == 35) {
         this.T.p = !this.T.p;
         this.M(this.T.p?"debug.advanced_tooltips.on":"debug.advanced_tooltips.off", new Object[0]);
         this.T.m();
         return true;
      } else if(var1 == 49) {
         if(!this.sf.n(2, "")) {
            this.M("debug.creative_spectator.error", new Object[0]);
         } else if(this.sf.V8()) {
            this.sf.f("/gamemode spectator");
         } else if(this.sf.VX()) {
            this.sf.f("/gamemode creative");
         }

         return true;
      } else if(var1 == 25) {
         this.T.iu = !this.T.iu;
         this.T.m();
         this.M(this.T.iu?"debug.pause_focus.on":"debug.pause_focus.off", new Object[0]);
         return true;
      } else if(var1 == 16) {
         this.M("debug.help.message", new Object[0]);
         tz var2 = this.y.I();
         var2.G(new net.cb.h("debug.reload_chunks.help", new Object[0]));
         var2.G(new net.cb.h("debug.show_hitboxes.help", new Object[0]));
         var2.G(new net.cb.h("debug.clear_chat.help", new Object[0]));
         var2.G(new net.cb.h("debug.cycle_renderdistance.help", new Object[0]));
         var2.G(new net.cb.h("debug.chunk_boundaries.help", new Object[0]));
         var2.G(new net.cb.h("debug.advanced_tooltips.help", new Object[0]));
         var2.G(new net.cb.h("debug.creative_spectator.help", new Object[0]));
         var2.G(new net.cb.h("debug.pause_focus.help", new Object[0]));
         var2.G(new net.cb.h("debug.help.help", new Object[0]));
         var2.G(new net.cb.h("debug.reload_resourcepacks.help", new Object[0]));
         return true;
      } else if(var1 == 20) {
         this.M("debug.reload_resourcepacks.message", new Object[0]);
         this.R();
         return true;
      } else {
         return false;
      }
   }

   private void D() {
      for(; this.T.L.r(); this.o.W()) {
         ++this.T.wR;
         if(this.T.wR > 2) {
            this.T.wR = 0;
         }

         if(this.T.wR == 0) {
            this.s4.v(this.A());
         } else if(this.T.wR == 1) {
            this.s4.v((l)null);
         }
      }

      while(this.T.wb.r()) {
         this.T.w4 = !this.T.w4;
      }

      int var1 = 0;

      while(true) {
         boolean var2 = this.T.x.o();
         boolean var3 = this.T.wd.o();
         if(this.T.ww[var1].r()) {
            if(this.sf.VX()) {
               this.y.p().R(var1);
            } else {
               if(this.sf.V8() && this.s5 == null) {
                  ;
               }

               this.sf.a8.r = var1;
            }
         }

         ++var1;
      }
   }

   private void d() throws IOException {
      while(Mouse.next()) {
         int var1 = Mouse.getEventButton();
         net.nr.h.b(var1 - 100, Mouse.getEventButtonState());
         if(Mouse.getEventButtonState()) {
            z7 var2 = new z7(var1);
            _x.m(var2);
            if(this.sf.VX() && var1 == 2) {
               this.y.p().w();
            } else {
               net.nr.h.S(var1 - 100);
            }
         }

         long var6 = E() - this.sh;
         if(var6 <= 200L) {
            int var4 = Mouse.getEventDWheel();
            if(this.sf.VX()) {
               var4 = -1;
               if(this.y.p().w()) {
                  this.y.p().P(-var4);
               } else {
                  float var5 = net.u.t.T(this.sf.a6.m() + (float)var4 * 0.005F, 0.0F, 0.2F);
                  this.sf.a6.A(var5);
               }
            } else {
               this.sf.a8.r(var4);
            }

            if(this.s5 == null) {
               if(!this.sr && Mouse.getEventButtonState()) {
                  this.p();
               }
            } else if(this.s5 != null) {
               this.s5.m();
            }
         }
      }

   }

   private void M(String var1, Object... var2) {
      this.y.I().G((new net.cb.l("")).h((new net.cb.h("debug.prefix", new Object[0])).r((new net.cb.f()).i(net.cb.z.YELLOW).f(Boolean.valueOf(true)))).z(" ").h(new net.cb.h(var1, var2)));
   }

   public void p(String var1, String var2, @Nullable net.yv.t var3) {
      if(!gn.Q.j.d(sk.class).v()) {
         this.J((v)null);
         System.gc();
      }

      net.cg.d var4 = this.sA.i(var1, false);
      net.cg.z var5 = var4.F();
      var5 = new net.cg.z(var3, var1);
      var4.g(var5);
      var3 = new net.yv.t(var5);
      YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(this.ss, UUID.randomUUID().toString());
      MinecraftSessionService var7 = var6.createMinecraftSessionService();
      GameProfileRepository var8 = var6.createProfileRepository();
      net.n.s var9 = new net.n.s(var8, new File(this.sn, f.P.getName()));
      s0.R(var9);
      s0.B(var7);
      net.n.s.B(false);
      this.sQ = new net.yl.j(this, var1, var2, var3, var6, var7, var8, var9);
      this.sQ.U();
      this.s = true;
      this.l.H(net.c9.b.x("menu.loadingLevel", new Object[0]));

      while(!this.sQ.q()) {
         String var12 = this.sQ.b();
         this.l.y(net.c9.b.x(var12, new Object[0]));
         Thread.sleep(200L);
      }

      this.s(new w0());
      SocketAddress var13 = this.sQ.P().u();
      a var14 = a.X(var13);
      var14.Y(new net.yp.j(var14, this, (tu)null));
      var14.F(new net.yg.o(var13.toString(), 0, net.n2.t.LOGIN));
      var14.F(new net.yt.l(this.L().w()));
      this.X = var14;
   }

   public void J(@Nullable v var1) {
      this.q(var1, "");
   }

   public void q(@Nullable v var1, String var2) {
      net.yp.v var3 = this.d();
      var3.V();
      if(this.sQ != null && this.sQ.Z()) {
         this.sQ.G();
      }

      this.sQ = null;
      this.s4.w();
      this.sE = null;
      net.yc.d.o.S();
      this.j = null;
      this.X = null;
      if(this.l != null) {
         this.l.h(var2);
         if(!gn.Q.j.d(sk.class).v()) {
            this.l.y("");
         }
      }

      if(this.s8 != null) {
         this.sd.K();
         this.y.L();
         this.w((d)null);
         this.s = false;
      }

      this.s_.T();
      this.s8 = var1;
      if(this.o != null) {
         this.o.i(var1);
      }

      if(this.sv != null) {
         this.sv.I(var1);
      }

      net.c5.g.E.V(var1);
      if(!gn.Q.j.d(sk.class).v() && !this.s) {
         YggdrasilAuthenticationService var7 = new YggdrasilAuthenticationService(this.ss, UUID.randomUUID().toString());
         MinecraftSessionService var4 = var7.createMinecraftSessionService();
         GameProfileRepository var5 = var7.createProfileRepository();
         net.n.s var6 = new net.n.s(var5, new File(this.sn, f.P.getName()));
         s0.R(var6);
         s0.B(var4);
         net.n.s.B(false);
      }

      if(this.sf == null) {
         this.sf = this.sE.S(var1, new net.v.u(), new net.yf.n());
         this.sE.R(this.sf);
      }

      this.sf.G();
      var1.S(this.sf);
      this.sf.xD = new net.yz.n(this.T);
      this.sE.s(this.sf);
      this.j = this.sf;
      if(!gn.Q.j.d(sk.class).v()) {
         System.gc();
      }

      this.sh = 0L;
   }

   public void s(int var1) {
      this.s8.A();
      this.s8.c();
      int var2 = 0;
      String var3 = null;
      if(this.sf != null) {
         var2 = this.sf.G();
         this.s8.W((l)this.sf);
         var3 = this.sf.e();
      }

      this.j = null;
      g var4 = this.sf;
      this.sf = this.sE.S(this.s8, this.sf == null?new net.v.u():this.sf.q(), this.sf == null?new net.v.c():this.sf.m());
      this.sf.A().l(var4.A().Z());
      this.sf.y = var1;
      this.j = this.sf;
      this.sf.G();
      this.sf.m(var3);
      this.s8.S(this.sf);
      this.sE.R(this.sf);
      this.sf.xD = new net.yz.n(this.T);
      this.sf.K(var2);
      this.sE.s(this.sf);
      this.sf.Q(var4.VI());
      if(this.s5 instanceof tr) {
         this.s((tu)null);
      }

   }

   public final boolean e() {
      return this.u;
   }

   @Nullable
   public net.yp.v d() {
      return this.sf == null?null:this.sf.x3;
   }

   public static boolean O() {
      return e == null || !e.T.h;
   }

   public static boolean Y() {
      return e != null && e.T.tR;
   }

   public static boolean K() {
      return e != null && e.T.wD != 0;
   }

   private void J() {
      if(this.H != null && this.H.v != net.u.m.MISS) {
         boolean var1 = this.sf.a6.V;
         net.ni.v var2 = null;
         if(this.H.v != net.u.m.BLOCK) {
            if(this.H.v == net.u.m.ENTITY && this.H.e != null) {
               ;
            }

            return;
         }

         net.u.j var4 = this.H.j();
         net.yw.n var5 = this.s8.Z(var4);
         net.y9.l var6 = var5.Q();
         if(var5.n() == net.y1.l.q) {
            return;
         }

         ks var3 = var6.N(this.s8, var4, var5);
         if(var3.B()) {
            return;
         }

         if(tu.T() && var6.W()) {
            var2 = this.s8.L(var4);
         }

         if(var3.B()) {
            String var7 = "";
            if(this.H.v == net.u.m.BLOCK) {
               var7 = ((m_)net.y9.l.m.t(this.s8.Z(this.H.j()).Q())).toString();
            } else if(this.H.v == net.u.m.ENTITY) {
               var7 = net.ne.v.K(this.H.e).toString();
            }

            s2.warn("Picking on: [{}] {} gave null item", this.H.v, var7);
         } else {
            net.r.i var8 = this.sf.a8;
            this.c(var3, var2);
            var8.G(var3);
            var8.i(var3);
            this.sE.J(this.sf.o(net.yz.k.MAIN_HAND), 36 + var8.r);
         }
      }

   }

   private ks c(ks var1, net.ni.v var2) {
      net.nj.f var3 = var2.b(new net.nj.f());
      if(var1.Z() == net.nb.j.Y9 && var3.G("Owner")) {
         net.nj.f var6 = var3.o("Owner");
         net.nj.f var7 = new net.nj.f();
         var7.K("SkullOwner", var6);
         var1.t(var7);
         return var1;
      } else {
         var1.Q("BlockEntityTag", var3);
         net.nj.f var4 = new net.nj.f();
         net.nj.h var5 = new net.nj.h();
         var5.m(new net.nj.y("(+NBT)"));
         var4.K("Lore", var5);
         var1.Q("display", var4);
         return var1;
      }
   }

   public net.d.w J(net.d.w var1) {
      var1.k().L("Launched Version", () -> {
         return this.sj;
      });
      var1.k().L("LWJGL", Sys::getVersion);
      var1.k().L("OpenGL", () -> {
         return net.y.d.F(7937) + " GL version " + net.y.d.F(7938) + ", " + net.y.d.F(7936);
      });
      var1.k().L("GL Caps", ui::g);
      var1.k().L("Using VBOs", () -> {
         return this.T.ip?"Yes":"No";
      });
      var1.k().L("Is Modded", () -> {
         String var0 = p.S();
         return !"vanilla".equals(var0)?"Definitely; Client brand changed to \'" + var0 + "\'":(j.class.getSigners() == null?"Very likely; Jar signature invalidated":"Probably not. Jar signature remains and client brand is untouched.");
      });
      var1.k().L("Type", () -> {
         return "Client (map_client.txt)";
      });
      var1.k().L("Resource Packs", () -> {
         StringBuilder var1 = new StringBuilder();

         for(String var3 : this.T.f) {
            if(var1.length() > 0) {
               var1.append(", ");
            }

            var1.append(var3);
            if(this.T.wc.contains(var3)) {
               var1.append(" (incompatible)");
            }
         }

         return var1.toString();
      });
      var1.k().L("Current Language", () -> {
         return this.su.D().toString();
      });
      var1.k().L("Profiler Position", () -> {
         return this.sl.R?this.sl.D():"N/A (disabled)";
      });
      var1.k().L("CPU", () -> {
         return ui.A();
      });
      if(this.s8 != null) {
         this.s8.W(var1);
      }

      return var1;
   }

   public void C() {
      this.e();
   }

   public void e() {
      this.n();
   }

   public void n() {
      this.i();
   }

   public void i() {
      this.u();
   }

   public void u() {
      this.V();
   }

   public void V() {
      this.c();
   }

   public void c() {
      this.o();
   }

   public void o() {
      this.w();
   }

   public void w() {
      this.U();
   }

   public void U() {
      this.W();
   }

   public void W() {
      this.C();
   }

   public static j b() {
      return e;
   }

   public ListenableFuture m() {
      return this.d(this::R);
   }

   public void f(net.yk.e var1) {
      var1.H("fps", Integer.valueOf(t));
      var1.H("vsync_enabled", Boolean.valueOf(this.T.wx));
      var1.H("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
      var1.H("display_type", this.J?"fullscreen":"windowed");
      var1.H("run_time", Long.valueOf((f.X() - var1.A()) / 60L * 1000L));
      var1.H("current_action", this.Z());
      var1.H("language", this.T.wP == null?"en_us":this.T.wP);
      String var2 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN?"little":"big";
      var1.H("endianness", var2);
      var1.H("subtitles", Boolean.valueOf(this.T.t2));
      var1.H("touch", this.T.iI?"touch":"mouse");
      var1.H("resource_packs", Integer.valueOf(this.sd.q().size()));
      int var3 = 0;

      for(net.c9.c var5 : this.sd.q()) {
         var1.H("resource_pack[" + var3++ + "]", var5.V());
      }

      if(this.sQ != null && this.sQ.S() != null) {
         var1.H("snooper_partner", this.sQ.S().K());
      }

   }

   private String Z() {
      return this.sQ != null?(this.sQ.w()?"hosting_lan":"singleplayer"):(this.m != null?(this.m.Z()?"playing_lan":"multiplayer"):"out_of_game");
   }

   public void r(net.yk.e var1) {
      var1.d("opengl_version", net.y.d.F(7938));
      var1.d("opengl_vendor", net.y.d.F(7936));
      var1.d("client_brand", p.S());
      var1.d("launched_version", this.sj);
      ContextCapabilities var3 = GLContext.getCapabilities();
      var1.d("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(var3.GL_ARB_arrays_of_arrays));
      var1.d("gl_caps[ARB_base_instance]", Boolean.valueOf(var3.GL_ARB_base_instance));
      var1.d("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(var3.GL_ARB_blend_func_extended));
      var1.d("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(var3.GL_ARB_clear_buffer_object));
      var1.d("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(var3.GL_ARB_color_buffer_float));
      var1.d("gl_caps[ARB_compatibility]", Boolean.valueOf(var3.GL_ARB_compatibility));
      var1.d("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(var3.GL_ARB_compressed_texture_pixel_storage));
      var1.d("gl_caps[ARB_compute_shader]", Boolean.valueOf(var3.GL_ARB_compute_shader));
      var1.d("gl_caps[ARB_copy_buffer]", Boolean.valueOf(var3.GL_ARB_copy_buffer));
      var1.d("gl_caps[ARB_copy_image]", Boolean.valueOf(var3.GL_ARB_copy_image));
      var1.d("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(var3.GL_ARB_depth_buffer_float));
      var1.d("gl_caps[ARB_compute_shader]", Boolean.valueOf(var3.GL_ARB_compute_shader));
      var1.d("gl_caps[ARB_copy_buffer]", Boolean.valueOf(var3.GL_ARB_copy_buffer));
      var1.d("gl_caps[ARB_copy_image]", Boolean.valueOf(var3.GL_ARB_copy_image));
      var1.d("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(var3.GL_ARB_depth_buffer_float));
      var1.d("gl_caps[ARB_depth_clamp]", Boolean.valueOf(var3.GL_ARB_depth_clamp));
      var1.d("gl_caps[ARB_depth_texture]", Boolean.valueOf(var3.GL_ARB_depth_texture));
      var1.d("gl_caps[ARB_draw_buffers]", Boolean.valueOf(var3.GL_ARB_draw_buffers));
      var1.d("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(var3.GL_ARB_draw_buffers_blend));
      var1.d("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(var3.GL_ARB_draw_elements_base_vertex));
      var1.d("gl_caps[ARB_draw_indirect]", Boolean.valueOf(var3.GL_ARB_draw_indirect));
      var1.d("gl_caps[ARB_draw_instanced]", Boolean.valueOf(var3.GL_ARB_draw_instanced));
      var1.d("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(var3.GL_ARB_explicit_attrib_location));
      var1.d("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(var3.GL_ARB_explicit_uniform_location));
      var1.d("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(var3.GL_ARB_fragment_layer_viewport));
      var1.d("gl_caps[ARB_fragment_program]", Boolean.valueOf(var3.GL_ARB_fragment_program));
      var1.d("gl_caps[ARB_fragment_shader]", Boolean.valueOf(var3.GL_ARB_fragment_shader));
      var1.d("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(var3.GL_ARB_fragment_program_shadow));
      var1.d("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(var3.GL_ARB_framebuffer_object));
      var1.d("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(var3.GL_ARB_framebuffer_sRGB));
      var1.d("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(var3.GL_ARB_geometry_shader4));
      var1.d("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(var3.GL_ARB_gpu_shader5));
      var1.d("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(var3.GL_ARB_half_float_pixel));
      var1.d("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(var3.GL_ARB_half_float_vertex));
      var1.d("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(var3.GL_ARB_instanced_arrays));
      var1.d("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(var3.GL_ARB_map_buffer_alignment));
      var1.d("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(var3.GL_ARB_map_buffer_range));
      var1.d("gl_caps[ARB_multisample]", Boolean.valueOf(var3.GL_ARB_multisample));
      var1.d("gl_caps[ARB_multitexture]", Boolean.valueOf(var3.GL_ARB_multitexture));
      var1.d("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(var3.GL_ARB_occlusion_query2));
      var1.d("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(var3.GL_ARB_pixel_buffer_object));
      var1.d("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(var3.GL_ARB_seamless_cube_map));
      var1.d("gl_caps[ARB_shader_objects]", Boolean.valueOf(var3.GL_ARB_shader_objects));
      var1.d("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(var3.GL_ARB_shader_stencil_export));
      var1.d("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(var3.GL_ARB_shader_texture_lod));
      var1.d("gl_caps[ARB_shadow]", Boolean.valueOf(var3.GL_ARB_shadow));
      var1.d("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(var3.GL_ARB_shadow_ambient));
      var1.d("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(var3.GL_ARB_stencil_texturing));
      var1.d("gl_caps[ARB_sync]", Boolean.valueOf(var3.GL_ARB_sync));
      var1.d("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(var3.GL_ARB_tessellation_shader));
      var1.d("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(var3.GL_ARB_texture_border_clamp));
      var1.d("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(var3.GL_ARB_texture_buffer_object));
      var1.d("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(var3.GL_ARB_texture_cube_map));
      var1.d("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(var3.GL_ARB_texture_cube_map_array));
      var1.d("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(var3.GL_ARB_texture_non_power_of_two));
      var1.d("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(var3.GL_ARB_uniform_buffer_object));
      var1.d("gl_caps[ARB_vertex_blend]", Boolean.valueOf(var3.GL_ARB_vertex_blend));
      var1.d("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(var3.GL_ARB_vertex_buffer_object));
      var1.d("gl_caps[ARB_vertex_program]", Boolean.valueOf(var3.GL_ARB_vertex_program));
      var1.d("gl_caps[ARB_vertex_shader]", Boolean.valueOf(var3.GL_ARB_vertex_shader));
      var1.d("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(var3.GL_EXT_bindable_uniform));
      var1.d("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(var3.GL_EXT_blend_equation_separate));
      var1.d("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(var3.GL_EXT_blend_func_separate));
      var1.d("gl_caps[EXT_blend_minmax]", Boolean.valueOf(var3.GL_EXT_blend_minmax));
      var1.d("gl_caps[EXT_blend_subtract]", Boolean.valueOf(var3.GL_EXT_blend_subtract));
      var1.d("gl_caps[EXT_draw_instanced]", Boolean.valueOf(var3.GL_EXT_draw_instanced));
      var1.d("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(var3.GL_EXT_framebuffer_multisample));
      var1.d("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(var3.GL_EXT_framebuffer_object));
      var1.d("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(var3.GL_EXT_framebuffer_sRGB));
      var1.d("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(var3.GL_EXT_geometry_shader4));
      var1.d("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(var3.GL_EXT_gpu_program_parameters));
      var1.d("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(var3.GL_EXT_gpu_shader4));
      var1.d("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(var3.GL_EXT_multi_draw_arrays));
      var1.d("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(var3.GL_EXT_packed_depth_stencil));
      var1.d("gl_caps[EXT_paletted_texture]", Boolean.valueOf(var3.GL_EXT_paletted_texture));
      var1.d("gl_caps[EXT_rescale_normal]", Boolean.valueOf(var3.GL_EXT_rescale_normal));
      Q();
      var1.d("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(var3.GL_EXT_separate_shader_objects));
      var1.d("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(var3.GL_EXT_shader_image_load_store));
      var1.d("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(var3.GL_EXT_shadow_funcs));
      var1.d("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(var3.GL_EXT_shared_texture_palette));
      var1.d("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(var3.GL_EXT_stencil_clear_tag));
      var1.d("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(var3.GL_EXT_stencil_two_side));
      var1.d("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(var3.GL_EXT_stencil_wrap));
      var1.d("gl_caps[EXT_texture_3d]", Boolean.valueOf(var3.GL_EXT_texture_3d));
      var1.d("gl_caps[EXT_texture_array]", Boolean.valueOf(var3.GL_EXT_texture_array));
      var1.d("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(var3.GL_EXT_texture_buffer_object));
      var1.d("gl_caps[EXT_texture_integer]", Boolean.valueOf(var3.GL_EXT_texture_integer));
      var1.d("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(var3.GL_EXT_texture_lod_bias));
      var1.d("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(var3.GL_EXT_texture_sRGB));
      var1.d("gl_caps[EXT_vertex_shader]", Boolean.valueOf(var3.GL_EXT_vertex_shader));
      var1.d("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(var3.GL_EXT_vertex_weighting));
      var1.d("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(net.y.d.S('譊')));
      net.y.d.z();
      var1.d("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(net.y.d.S('證')));
      net.y.d.z();
      var1.d("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(net.y.d.S('衩')));
      net.y.d.z();
      var1.d("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(net.y.d.S('譌')));
      net.y.d.z();
      var1.d("gl_caps[gl_max_texture_image_units]", Integer.valueOf(net.y.d.S('衲')));
      net.y.d.z();
      var1.d("gl_caps[gl_max_array_texture_layers]", Integer.valueOf(net.y.d.S('裿')));
      net.y.d.z();
      var1.d("gl_max_texture_size", Integer.valueOf(T()));
      GameProfile var4 = this.sV.w();
      if(var4 != null && var4.getId() != null) {
         var1.d("uuid", Hashing.sha1().hashBytes(var4.getId().toString().getBytes(Charsets.ISO_8859_1)).toString());
      }

      net.u.d.h(new net.u.d[2]);
   }

   public static int T() {
      short var0 = 16384;
      net.y.d.U('聤', 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
      int var1 = net.y.d.M('聤', 0, 4096);
      return var0;
   }

   public boolean V() {
      return this.T.wp;
   }

   public void w(d var1) {
      this.m = var1;
   }

   @Nullable
   public d m() {
      return this.m;
   }

   public boolean w() {
      return this.s;
   }

   public boolean T() {
      return this.s && this.sQ != null;
   }

   @Nullable
   public net.yl.j V() {
      return this.sQ;
   }

   public static void I() {
      if(e != null) {
         net.yl.j var0 = e.V();
         var0.k();
      }

   }

   public net.yk.e e() {
      return this.f;
   }

   public static long E() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   public boolean f() {
      return this.J;
   }

   public net.yz.u L() {
      return this.sV;
   }

   public PropertyMap Q() {
      if(this.sD.isEmpty()) {
         GameProfile var1 = this.Y().fillProfileProperties(this.sV.w(), false);
         this.sD.putAll(var1.getProperties());
      }

      return this.sD;
   }

   public Proxy u() {
      return this.ss;
   }

   public e n() {
      return this.U;
   }

   public net.c9.p C() {
      return this.sg;
   }

   public net.c9.c g() {
      return this.sd;
   }

   public i I() {
      return this.su;
   }

   public net.n9.b p() {
      return this.sZ;
   }

   public boolean X() {
      return this.L;
   }

   public boolean F() {
      return this.s6;
   }

   public net.h.m n() {
      return this.s_;
   }

   public y.i R() {
      return this.s5 instanceof w3?y.i.CREDITS:(this.sf == null?y.i.MENU:(this.sf.hl.F instanceof net.yv.b?y.i.NETHER:(this.sf.hl.F instanceof net.yv.k?(this.y.T().c()?y.i.END_BOSS:y.i.END):(this.sf.a6.V && this.sf.a6.P?y.i.CREATIVE:y.i.GAME))));
   }

   public void P() {
      int var1 = Keyboard.getEventKey() == 0?Keyboard.getEventCharacter() + 256:Keyboard.getEventKey();
      if(!Keyboard.isRepeatEvent() && (!(this.s5 instanceof tv) || ((tv)this.s5).K <= E() - 20L) && Keyboard.getEventKeyState()) {
         if(var1 == this.T.iK.m()) {
            this.q();
         } else if(var1 == this.T.ws.m()) {
            this.y.I().G(av.d(this.sn, this.sB, this.st, this.a));
         } else if(var1 == 48 && tu.T() && (this.s5 == null || this.s5 != null && !this.s5.W())) {
            this.T.T(net.nr.d.NARRATOR, 1);
            if(this.s5 instanceof wy) {
               ((wy)this.s5).e();
            }
         }
      }

   }

   public MinecraftSessionService Y() {
      return this.i;
   }

   public net.c9.o s() {
      return this.sI;
   }

   @Nullable
   public l A() {
      return this.j;
   }

   public void w(l var1) {
      this.j = var1;
      this.s4.v(var1);
   }

   public ListenableFuture V(Callable var1) {
      Validate.notNull(var1);
      if(this.R()) {
         return Futures.immediateFuture(var1.call());
      } else {
         ListenableFutureTask var2 = ListenableFutureTask.create(var1);
         Queue var3 = this.sL;
         this.sL.add(var2);
         return var2;
      }
   }

   public ListenableFuture d(Runnable var1) {
      Validate.notNull(var1);
      return this.V(Executors.callable(var1));
   }

   public boolean R() {
      return Thread.currentThread() == this.A;
   }

   public net.y.k x() {
      return this.p;
   }

   public net.y0.d N() {
      return this.z;
   }

   public t K() {
      return this.P;
   }

   public ub h() {
      return this.sc;
   }

   public net.yf.g T(b.t var1) {
      return this.sN.U(var1);
   }

   public static int w() {
      return t;
   }

   public a1 P() {
      return this.sw;
   }

   public boolean I() {
      return this.si;
   }

   public void f(boolean var1) {
      this.si = var1;
   }

   public net.c0.d a() {
      return this.sp;
   }

   public float H() {
      return this.s9.G;
   }

   public float P() {
      return this.s9.G;
   }

   public net.yo.j q() {
      return this.M;
   }

   public boolean P() {
      return this.sf != null && this.sf.VI() || this.T.a;
   }

   public net.nd.h J() {
      return this.sR;
   }

   public net.cl.e K() {
      return this.sP;
   }

   static {
      r(new net.u.d[5]);
   }

   public static void r(net.u.d[] var0) {
      d = var0;
   }

   public static net.u.d[] Q() {
      return d;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
