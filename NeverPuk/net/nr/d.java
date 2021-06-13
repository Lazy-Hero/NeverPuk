package net.nr;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net._i;
import net.by;
import net.i6;
import net.m8;
import net.oq;
import net.oz;
import net.w8;
import net.wo;
import net.x4;
import net.x7;
import net.xn;
import net.z9;
import net.c0.q;
import net.c9.b;
import net.nr.h;
import net.r.j;
import net.r.r;
import net.u.t;
import net.y.ui;
import net.yz.aa;
import net.yz.c;
import net.yz.p;
import net.z.tu;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class d {
   private static final Logger wa = LogManager.getLogger();
   private static final Gson wV = new Gson();
   private static final Type iv = new ParameterizedType() {
      public Type[] getActualTypeArguments() {
         return new Type[]{String.class};
      }

      public Type getRawType() {
         return List.class;
      }

      public Type getOwnerType() {
         return null;
      }
   };
   public static final Splitter r = Splitter.on(':');
   private static final String[] F = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] wT = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] wf = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
   private static final String[] ic = new String[]{"options.off", "options.clouds.fast", "options.clouds.fancy"};
   private static final String[] iG = new String[]{"options.off", "options.attack.crosshair", "options.attack.hotbar"};
   public static final String[] wG = new String[]{"options.narrator.off", "options.narrator.all", "options.narrator.chat", "options.narrator.system"};
   public float tM = 0.5F;
   public boolean iX;
   public int ij = -1;
   public boolean Y = true;
   public boolean iW;
   public boolean wl = true;
   public int B = 120;
   public int im = 2;
   public boolean tR = true;
   public int wD = 2;
   public List f = Lists.newArrayList();
   public List wc = Lists.newArrayList();
   public r.b i3 = r.b.FULL;
   public boolean ig = true;
   public boolean wm = true;
   public boolean q = true;
   public float w1 = 1.0F;
   public boolean wp = true;
   public boolean D;
   public boolean wx = true;
   public boolean ip = true;
   public boolean a;
   public boolean n;
   public boolean p;
   public boolean iu = true;
   private final Set wz = Sets.newHashSet(j.values());
   public boolean iI;
   public aa w3 = aa.RIGHT;
   public int c;
   public int ia;
   public boolean J = true;
   public float H = 1.0F;
   public float U = 1.0F;
   public float io = 0.44366196F;
   public float k = 1.0F;
   public int z = 4;
   private final Map iR = Maps.newEnumMap(p.class);
   public boolean w = true;
   public boolean wZ = true;
   public int ie = 1;
   public boolean w_;
   public boolean t2;
   public boolean wk = true;
   public boolean i6 = true;
   public net.cl.p iY = net.cl.p.MOVEMENT;
   public h ib = new h("key.forward", 17, "key.categories.movement");
   public h w2 = new h("key.left", 30, "key.categories.movement");
   public h P = new h("key.back", 31, "key.categories.movement");
   public h tT = new h("key.right", 32, "key.categories.movement");
   public h iD = new h("key.jump", 57, "key.categories.movement");
   public h w0 = new h("key.sneak", 42, "key.categories.movement");
   public h iE = new h("key.sprint", 29, "key.categories.movement");
   public h iH = new h("key.inventory", 18, "key.categories.inventory");
   public h wU = new h("key.swapHands", 33, "key.categories.inventory");
   public h wX = new h("key.drop", 16, "key.categories.inventory");
   public h iF = new h("key.use", -99, "key.categories.gameplay");
   public h Q = new h("key.attack", -100, "key.categories.gameplay");
   public h Z = new h("key.pickItem", -98, "key.categories.gameplay");
   public h wg = new h("key.chat", 20, "key.categories.multiplayer");
   public h G = new h("key.playerlist", 15, "key.categories.multiplayer");
   public h wy = new h("key.command", 53, "key.categories.multiplayer");
   public h ws = new h("key.screenshot", 60, "key.categories.misc");
   public h L = new h("key.togglePerspective", 63, "key.categories.misc");
   public h wb = new h("key.smoothCamera", 0, "key.categories.misc");
   public h iK = new h("key.fullscreen", 87, "key.categories.misc");
   public h K = new h("key.spectatorOutlines", 0, "key.categories.misc");
   public h ii = new h("key.advancements", 38, "key.categories.misc");
   public h[] ww = new h[]{new h("key.hotbar.1", 2, "key.categories.inventory"), new h("key.hotbar.2", 3, "key.categories.inventory"), new h("key.hotbar.3", 4, "key.categories.inventory"), new h("key.hotbar.4", 5, "key.categories.inventory"), new h("key.hotbar.5", 6, "key.categories.inventory"), new h("key.hotbar.6", 7, "key.categories.inventory"), new h("key.hotbar.7", 8, "key.categories.inventory"), new h("key.hotbar.8", 9, "key.categories.inventory"), new h("key.hotbar.9", 10, "key.categories.inventory")};
   public h x = new h("key.saveToolbarActivator", 46, "key.categories.creative");
   public h wd = new h("key.loadToolbarActivator", 45, "key.categories.creative");
   public h[] i;
   protected net.nn.j w5;
   private File wE;
   public net.yv.l iA;
   public boolean h;
   public int wR;
   public boolean wt;
   public boolean iU;
   public boolean j;
   public String wI;
   public boolean w4;
   public boolean V;
   public float is;
   public float i2;
   public float iN;
   public int iL;
   public int wQ;
   public int wj;
   public String wP;
   public boolean in;
   public int wo = 1;
   public float O = 0.8F;
   public int iO = 0;
   public boolean iy = false;
   public boolean u = false;
   public boolean iV = z9.H();
   public boolean I = z9.H();
   public float R = 1.0F;
   public int wh = 0;
   public int wB = 1;
   public int wS = 0;
   public float wH = 0.0F;
   public int ir = 0;
   public int wv = 0;
   public int iZ = 0;
   public int wW = 3;
   public int M = 4000;
   public boolean wN = false;
   public boolean ih = false;
   public boolean l = false;
   public boolean iP = true;
   public boolean E = true;
   public boolean wO = true;
   public boolean S = true;
   public int wu = 0;
   public int s = 1;
   public boolean it = false;
   public int ix = 0;
   public boolean iC = false;
   public boolean id = false;
   public String i4 = "Default";
   public boolean wL = true;
   public boolean il = true;
   public boolean A = true;
   public boolean iS = true;
   public boolean N = true;
   public boolean iM = true;
   public boolean we = true;
   public int wM = 2;
   public boolean C = true;
   public boolean b = false;
   public boolean wn = false;
   public boolean w6 = false;
   public int o = 0;
   public boolean w7 = true;
   public boolean t = true;
   public int T = 3;
   public boolean w8 = true;
   public boolean ik = true;
   public int i8 = 1;
   public int iQ = 0;
   public int g = 0;
   public boolean iJ = true;
   public boolean wi = true;
   public boolean W = true;
   public boolean wq = true;
   public boolean d = true;
   public boolean wC = true;
   public boolean iB = true;
   public boolean v = true;
   public boolean wr = true;
   public boolean wY = true;
   public boolean w9 = true;
   public boolean m = true;
   public boolean tz = true;
   public boolean iz = true;
   public boolean wK = true;
   public static final int i5 = 0;
   public static final int iw = 1;
   public static final int X = 2;
   public static final int wA = 3;
   public static final int i_ = 4;
   public static final int i9 = 0;
   public static final int wJ = 1;
   public static final int tU = 2;
   public static final String iq = "Default";
   private static final int[] iT = new int[]{0, 1, 4, 2};
   private static final int[] e = new int[]{3, 1, 2};
   private static final String[] i0 = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
   public h i1;
   private File i7;
   private boolean y = false;
   private static String wF;

   public d(net.nn.j var1, File var2) {
      this.T();
      this.i = (h[])ArrayUtils.addAll(new h[]{this.Q, this.iF, this.ib, this.w2, this.P, this.tT, this.iD, this.w0, this.iE, this.wX, this.iH, this.wg, this.G, this.Z, this.wy, this.ws, this.L, this.wb, this.iK, this.K, this.wU, this.x, this.wd, this.ii}, this.ww);
      this.iA = net.yv.l.NORMAL;
      this.wI = "";
      this.is = 70.0F;
      this.wP = "en_us";
      this.w5 = var1;
      this.wE = new File(var2, "options.txt");
      if(var1.X() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
         d.l.RENDER_DISTANCE.u(32.0F);
      } else {
         d.l.RENDER_DISTANCE.u(16.0F);
      }

      this.ij = var1.X()?12:8;
      this.i7 = new File(var2, "optionsof.txt");
      this.B = (int)d.l.FRAMERATE_LIMIT.n();
      this.i1 = new h("of.key.zoom", 46, "key.categories.misc");
      this.i = (h[])ArrayUtils.add(this.i, this.i1);
      d.l.RENDER_DISTANCE.u(32.0F);
      this.ij = 8;
      this.b();
      z9.s(this);
   }

   public d() {
      this.T();
      this.i = (h[])ArrayUtils.addAll(new h[]{this.Q, this.iF, this.ib, this.w2, this.P, this.tT, this.iD, this.w0, this.iE, this.wX, this.iH, this.wg, this.G, this.Z, this.wy, this.ws, this.L, this.wb, this.iK, this.K, this.wU, this.x, this.wd, this.ii}, this.ww);
      this.iA = net.yv.l.NORMAL;
      this.wI = "";
      this.is = 70.0F;
      this.wP = "en_us";
   }

   public static String y(int var0) {
      switch(var0) {
      case -100:
         return b.x("key.mouse.left", new Object[0]);
      case -99:
         return b.x("key.mouse.right", new Object[0]);
      case -98:
         return b.x("key.mouse.middle", new Object[0]);
      default:
         return b.x("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)});
      }
   }

   public static boolean C(h var0) {
      int var1 = var0.m();
      return var1 < 256?Mouse.isButtonDown(var1 + 100):false;
   }

   public void F(h var1, int var2) {
      var1.s(var2);
      this.m();
   }

   public void N(d.l var1, float var2) {
      this.O(var1, var2);
      if(var1 == d.l.SENSITIVITY) {
         this.tM = var2;
      }

      if(var1 == d.l.FOV) {
         this.is = var2;
      }

      if(var1 == d.l.GAMMA) {
         this.i2 = var2;
      }

      if(var1 == d.l.FRAMERATE_LIMIT) {
         this.B = (int)var2;
         this.wx = false;
         if(this.B <= 0) {
            this.B = (int)d.l.FRAMERATE_LIMIT.n();
            this.wx = true;
         }

         this.W();
      }

      if(var1 == d.l.CHAT_OPACITY) {
         this.w1 = var2;
         this.w5.y.I().O();
      }

      if(var1 == d.l.CHAT_HEIGHT_FOCUSED) {
         this.k = var2;
         this.w5.y.I().O();
      }

      if(var1 == d.l.CHAT_HEIGHT_UNFOCUSED) {
         this.io = var2;
         this.w5.y.I().O();
      }

      if(var1 == d.l.CHAT_WIDTH) {
         this.U = var2;
         this.w5.y.I().O();
      }

      if(var1 == d.l.CHAT_SCALE) {
         this.H = var2;
         this.w5.y.I().O();
      }

      if(var1 == d.l.MIPMAP_LEVELS) {
         int var3 = this.z;
         this.z = (int)var2;
         if((float)var3 != var2) {
            this.w5.p().L(this.z);
            this.w5.n().E(net.n9.b.N);
            this.w5.p().c(false, this.z > 0);
            this.w5.m();
         }
      }

      if(var1 == d.l.RENDER_DISTANCE) {
         this.ij = (int)var2;
         this.w5.o.W();
      }

   }

   public void T(d.l var1, int var2) {
      this.A(var1, var2);
      if(var1 == d.l.RENDER_DISTANCE) {
         this.N(var1, t.T((float)(this.ij + var2), var1.k(), var1.n()));
      }

      if(var1 == d.l.MAIN_HAND) {
         this.w3 = this.w3.O();
      }

      if(var1 == d.l.INVERT_MOUSE) {
         this.iX = !this.iX;
      }

      if(var1 == d.l.GUI_SCALE) {
         this.iL += var2;
         if(tu.s()) {
            this.iL = 0;
         }

         DisplayMode var3 = z9.v();
         int var4 = var3.getWidth() / 320;
         int var5 = var3.getHeight() / 240;
         int var6 = Math.min(var4, var5);
         if(this.iL < 0) {
            this.iL = var6 - 1;
         }

         if(this.w5.c() && this.iL % 2 != 0) {
            this.iL += var2;
         }

         if(this.iL < 0 || this.iL >= var6) {
            this.iL = 0;
         }
      }

      if(var1 == d.l.PARTICLES) {
         this.wQ = (this.wQ + var2) % 3;
      }

      if(var1 == d.l.VIEW_BOBBING) {
         this.Y = !this.Y;
      }

      if(var1 == d.l.RENDER_CLOUDS) {
         this.im = (this.im + var2) % 3;
      }

      if(var1 == d.l.FORCE_UNICODE_FONT) {
         this.in = !this.in;
         this.w5.sO.d(this.w5.I().h() || this.in);
      }

      if(var1 == d.l.FBO_ENABLE) {
         this.wl = !this.wl;
      }

      if(var1 == d.l.ANAGLYPH) {
         if(!this.iW && z9.Q()) {
            z9.A(m8.i("of.message.an.shaders1"), m8.i("of.message.an.shaders2"));
            return;
         }

         this.iW = !this.iW;
         this.w5.R();
      }

      if(var1 == d.l.GRAPHICS) {
         this.tR = !this.tR;
         this.w();
         this.w5.o.n();
      }

      if(var1 == d.l.AMBIENT_OCCLUSION) {
         this.wD = (this.wD + var2) % 3;
         this.w5.o.n();
      }

      if(var1 == d.l.CHAT_VISIBILITY) {
         this.i3 = r.b.t((this.i3.d() + var2) % 3);
      }

      if(var1 == d.l.CHAT_COLOR) {
         this.ig = !this.ig;
      }

      if(var1 == d.l.CHAT_LINKS) {
         this.wm = !this.wm;
      }

      if(var1 == d.l.CHAT_LINKS_PROMPT) {
         this.q = !this.q;
      }

      if(var1 == d.l.SNOOPER_ENABLED) {
         this.wp = !this.wp;
      }

      if(var1 == d.l.TOUCHSCREEN) {
         this.iI = !this.iI;
      }

      if(var1 == d.l.USE_FULLSCREEN) {
         this.D = !this.D;
         if(this.w5.f() != this.D) {
            this.w5.q();
         }
      }

      if(var1 == d.l.ENABLE_VSYNC) {
         this.wx = !this.wx;
         Display.setVSyncEnabled(this.wx);
      }

      if(var1 == d.l.USE_VBO) {
         this.ip = !this.ip;
         this.w5.o.n();
      }

      if(var1 == d.l.REDUCED_DEBUG_INFO) {
         this.a = !this.a;
      }

      if(var1 == d.l.ENTITY_SHADOWS) {
         this.wZ = !this.wZ;
      }

      if(var1 == d.l.ATTACK_INDICATOR) {
         this.ie = (this.ie + var2) % 3;
      }

      if(var1 == d.l.SHOW_SUBTITLES) {
         this.t2 = !this.t2;
      }

      if(var1 == d.l.REALMS_NOTIFICATIONS) {
         this.wk = !this.wk;
      }

      if(var1 == d.l.AUTO_JUMP) {
         this.i6 = !this.i6;
      }

      if(var1 == d.l.NARRATOR) {
         if(net.yc.d.o.l()) {
            this.wj = (this.wj + var2) % wG.length;
         } else {
            this.wj = 0;
         }

         net.yc.d.o.a(this.wj);
      }

      this.m();
   }

   public float T(d.l var1) {
      float var2 = this.G(var1);
      return var2 != Float.MAX_VALUE?var2:(var1 == d.l.FOV?this.is:(var1 == d.l.GAMMA?this.i2:(var1 == d.l.SATURATION?this.iN:(var1 == d.l.SENSITIVITY?this.tM:(var1 == d.l.CHAT_OPACITY?this.w1:(var1 == d.l.CHAT_HEIGHT_FOCUSED?this.k:(var1 == d.l.CHAT_HEIGHT_UNFOCUSED?this.io:(var1 == d.l.CHAT_SCALE?this.H:(var1 == d.l.CHAT_WIDTH?this.U:(var1 == d.l.FRAMERATE_LIMIT?(float)this.B:(var1 == d.l.MIPMAP_LEVELS?(float)this.z:(var1 == d.l.RENDER_DISTANCE?(float)this.ij:0.0F))))))))))));
   }

   public boolean t(d.l var1) {
      switch(null.w[var1.ordinal()]) {
      case 1:
         return this.iX;
      case 2:
         return this.Y;
      case 3:
         return this.iW;
      case 4:
         return this.wl;
      case 5:
         return this.ig;
      case 6:
         return this.wm;
      case 7:
         return this.q;
      case 8:
         return this.wp;
      case 9:
         return this.D;
      case 10:
         return this.wx;
      case 11:
         return this.ip;
      case 12:
         return this.iI;
      case 13:
         return this.in;
      case 14:
         return this.a;
      case 15:
         return this.wZ;
      case 16:
         return this.t2;
      case 17:
         return this.wk;
      case 18:
         return this.w_;
      case 19:
         return this.i6;
      default:
         return false;
      }
   }

   private static String A(String[] var0, int var1) {
      if(var1 >= var0.length) {
         var1 = 0;
      }

      return b.x(var0[var1], new Object[0]);
   }

   public String L(d.l var1) {
      String var2 = this.E(var1);
      return var2;
   }

   public void b() {
      if(this.wE.exists()) {
         this.iR.clear();
         List var1 = IOUtils.readLines(new FileInputStream(this.wE), StandardCharsets.UTF_8);
         net.nj.f var2 = new net.nj.f();

         for(String var4 : var1) {
            Iterator var5 = r.omitEmptyStrings().limit(2).split(var4).iterator();
            var2.b((String)var5.next(), (String)var5.next());
         }

         var2 = this.O(var2);

         for(String var14 : var2.b()) {
            String var15 = var2.J(var14);
            if("mouseSensitivity".equals(var14)) {
               this.tM = this.f(var15);
            }

            if("fov".equals(var14)) {
               this.is = this.f(var15) * 40.0F + 70.0F;
            }

            if("gamma".equals(var14)) {
               this.i2 = this.f(var15);
            }

            if("saturation".equals(var14)) {
               this.iN = this.f(var15);
            }

            if("invertYMouse".equals(var14)) {
               this.iX = "true".equals(var15);
            }

            if("renderDistance".equals(var14)) {
               this.ij = Integer.parseInt(var15);
            }

            if("guiScale".equals(var14)) {
               this.iL = Integer.parseInt(var15);
            }

            if("particles".equals(var14)) {
               this.wQ = Integer.parseInt(var15);
            }

            if("bobView".equals(var14)) {
               this.Y = "true".equals(var15);
            }

            if("anaglyph3d".equals(var14)) {
               this.iW = "true".equals(var15);
            }

            if("maxFps".equals(var14)) {
               this.B = Integer.parseInt(var15);
               if(this.wx) {
                  this.B = (int)d.l.FRAMERATE_LIMIT.n();
               }

               if(this.B <= 0) {
                  this.B = (int)d.l.FRAMERATE_LIMIT.n();
               }
            }

            if("fboEnable".equals(var14)) {
               this.wl = "true".equals(var15);
            }

            if("difficulty".equals(var14)) {
               this.iA = net.yv.l.w(Integer.parseInt(var15));
            }

            if("fancyGraphics".equals(var14)) {
               this.tR = "true".equals(var15);
               this.w();
            }

            if("tutorialStep".equals(var14)) {
               this.iY = net.cl.p.e(var15);
            }

            if("ao".equals(var14)) {
               if("true".equals(var15)) {
                  this.wD = 2;
               } else if("false".equals(var15)) {
                  this.wD = 0;
               } else {
                  this.wD = Integer.parseInt(var15);
               }
            }

            if("renderClouds".equals(var14)) {
               if("true".equals(var15)) {
                  this.im = 2;
               } else if("false".equals(var15)) {
                  this.im = 0;
               } else if("fast".equals(var15)) {
                  this.im = 1;
               }
            }

            if("attackIndicator".equals(var14)) {
               if("0".equals(var15)) {
                  this.ie = 0;
               } else if("1".equals(var15)) {
                  this.ie = 1;
               } else if("2".equals(var15)) {
                  this.ie = 2;
               }
            }

            if("resourcePacks".equals(var14)) {
               this.f = (List)c.n(wV, var15, iv);
               if(this.f == null) {
                  this.f = Lists.newArrayList();
               }
            }

            if("incompatibleResourcePacks".equals(var14)) {
               this.wc = (List)c.n(wV, var15, iv);
               if(this.wc == null) {
                  this.wc = Lists.newArrayList();
               }
            }

            if("lastServer".equals(var14)) {
               this.wI = var15;
            }

            if("lang".equals(var14)) {
               this.wP = var15;
            }

            if("chatVisibility".equals(var14)) {
               this.i3 = r.b.t(Integer.parseInt(var15));
            }

            if("chatColors".equals(var14)) {
               this.ig = "true".equals(var15);
            }

            if("chatLinks".equals(var14)) {
               this.wm = "true".equals(var15);
            }

            if("chatLinksPrompt".equals(var14)) {
               this.q = "true".equals(var15);
            }

            if("chatOpacity".equals(var14)) {
               this.w1 = this.f(var15);
            }

            if("snooperEnabled".equals(var14)) {
               this.wp = "true".equals(var15);
            }

            if("fullscreen".equals(var14)) {
               this.D = "true".equals(var15);
            }

            if("enableVsync".equals(var14)) {
               this.wx = "true".equals(var15);
               if(this.wx) {
                  this.B = (int)d.l.FRAMERATE_LIMIT.n();
               }

               this.W();
            }

            if("useVbo".equals(var14)) {
               this.ip = "true".equals(var15);
            }

            if("hideServerAddress".equals(var14)) {
               this.n = "true".equals(var15);
            }

            if("advancedItemTooltips".equals(var14)) {
               this.p = "true".equals(var15);
            }

            if("pauseOnLostFocus".equals(var14)) {
               this.iu = "true".equals(var15);
            }

            if("touchscreen".equals(var14)) {
               this.iI = "true".equals(var15);
            }

            if("overrideHeight".equals(var14)) {
               this.ia = Integer.parseInt(var15);
            }

            if("overrideWidth".equals(var14)) {
               this.c = Integer.parseInt(var15);
            }

            if("heldItemTooltips".equals(var14)) {
               this.J = "true".equals(var15);
            }

            if("chatHeightFocused".equals(var14)) {
               this.k = this.f(var15);
            }

            if("chatHeightUnfocused".equals(var14)) {
               this.io = this.f(var15);
            }

            if("chatScale".equals(var14)) {
               this.H = this.f(var15);
            }

            if("chatWidth".equals(var14)) {
               this.U = this.f(var15);
            }

            if("mipmapLevels".equals(var14)) {
               this.z = Integer.parseInt(var15);
            }

            if("forceUnicodeFont".equals(var14)) {
               this.in = "true".equals(var15);
            }

            if("reducedDebugInfo".equals(var14)) {
               this.a = "true".equals(var15);
            }

            if("useNativeTransport".equals(var14)) {
               this.w = "true".equals(var15);
            }

            if("entityShadows".equals(var14)) {
               this.wZ = "true".equals(var15);
            }

            if("mainHand".equals(var14)) {
               this.w3 = "left".equals(var15)?aa.LEFT:aa.RIGHT;
            }

            if("showSubtitles".equals(var14)) {
               this.t2 = "true".equals(var15);
            }

            if("realmsNotifications".equals(var14)) {
               this.wk = "true".equals(var15);
            }

            if("enableWeakAttacks".equals(var14)) {
               this.w_ = "true".equals(var15);
            }

            if("autoJump".equals(var14)) {
               this.i6 = "true".equals(var15);
            }

            if("narrator".equals(var14)) {
               this.wj = Integer.parseInt(var15);
            }

            for(h var9 : this.i) {
               if(var14.equals("key_" + var9.g())) {
                  if(i6.Mb.r()) {
                     if(var15.indexOf(58) != -1) {
                        String[] var10 = var15.split(":");
                        Object var11 = i6.H(i6.Mb, new Object[]{var10[1]});
                        i6.b(var9, i6.uC, new Object[]{var11, Integer.valueOf(Integer.parseInt(var10[0]))});
                     } else {
                        Object var24 = i6.n(i6.C6);
                        i6.b(var9, i6.uC, new Object[]{var24, Integer.valueOf(Integer.parseInt(var15))});
                     }
                  } else {
                     var9.s(Integer.parseInt(var15));
                  }
               }
            }

            for(p var22 : p.values()) {
               if(var14.equals("soundCategory_" + var22.W())) {
                  this.iR.put(var22, Float.valueOf(this.f(var15)));
               }
            }

            for(j var23 : j.values()) {
               if(var14.equals("modelPart_" + var23.x())) {
                  this.A(var23, "true".equals(var15));
               }
            }
         }

         h.G();
         this.H();
      }
   }

   private net.nj.f O(net.nj.f var1) {
      int var2 = 0;
      var2 = Integer.parseInt(var1.J("version"));
      return this.w5.a().w(q.OPTIONS, var1, var2);
   }

   private float f(String var1) {
      return "true".equals(var1)?1.0F:("false".equals(var1)?0.0F:Float.parseFloat(var1));
   }

   public void m() {
      if(i6.v.l()) {
         Object var1 = i6.H(i6.uJ, new Object[0]);
         if(i6.I(var1, i6.MW, new Object[0])) {
            return;
         }
      }

      PrintWriter var10 = null;
      var10 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.wE), StandardCharsets.UTF_8));
      var10.println("version:1343");
      var10.println("invertYMouse:" + this.iX);
      var10.println("mouseSensitivity:" + this.tM);
      var10.println("fov:" + (this.is - 70.0F) / 40.0F);
      var10.println("gamma:" + this.i2);
      var10.println("saturation:" + this.iN);
      var10.println("renderDistance:" + this.ij);
      var10.println("guiScale:" + this.iL);
      var10.println("particles:" + this.wQ);
      var10.println("bobView:" + this.Y);
      var10.println("anaglyph3d:" + this.iW);
      var10.println("maxFps:" + this.B);
      var10.println("fboEnable:" + this.wl);
      var10.println("difficulty:" + this.iA.L());
      var10.println("fancyGraphics:" + this.tR);
      var10.println("ao:" + this.wD);
      switch(this.im) {
      case 0:
         var10.println("renderClouds:false");
         break;
      case 1:
         var10.println("renderClouds:fast");
         break;
      case 2:
         var10.println("renderClouds:true");
      }

      var10.println("resourcePacks:" + wV.toJson(this.f));
      var10.println("incompatibleResourcePacks:" + wV.toJson(this.wc));
      var10.println("lastServer:" + this.wI);
      var10.println("lang:" + this.wP);
      var10.println("chatVisibility:" + this.i3.d());
      var10.println("chatColors:" + this.ig);
      var10.println("chatLinks:" + this.wm);
      var10.println("chatLinksPrompt:" + this.q);
      var10.println("chatOpacity:" + this.w1);
      var10.println("snooperEnabled:" + this.wp);
      var10.println("fullscreen:" + this.D);
      var10.println("enableVsync:" + this.wx);
      var10.println("useVbo:" + this.ip);
      var10.println("hideServerAddress:" + this.n);
      var10.println("advancedItemTooltips:" + this.p);
      var10.println("pauseOnLostFocus:" + this.iu);
      var10.println("touchscreen:" + this.iI);
      var10.println("overrideWidth:" + this.c);
      var10.println("overrideHeight:" + this.ia);
      var10.println("heldItemTooltips:" + this.J);
      var10.println("chatHeightFocused:" + this.k);
      var10.println("chatHeightUnfocused:" + this.io);
      var10.println("chatScale:" + this.H);
      var10.println("chatWidth:" + this.U);
      var10.println("mipmapLevels:" + this.z);
      var10.println("forceUnicodeFont:" + this.in);
      var10.println("reducedDebugInfo:" + this.a);
      var10.println("useNativeTransport:" + this.w);
      var10.println("entityShadows:" + this.wZ);
      var10.println("mainHand:" + (this.w3 == aa.LEFT?"left":"right"));
      var10.println("attackIndicator:" + this.ie);
      var10.println("showSubtitles:" + this.t2);
      var10.println("realmsNotifications:" + this.wk);
      var10.println("enableWeakAttacks:" + this.w_);
      var10.println("autoJump:" + this.i6);
      var10.println("narrator:" + this.wj);
      var10.println("tutorialStep:" + this.iY.I());

      for(h var5 : this.i) {
         if(i6.J.r()) {
            String var6 = "key_" + var5.g() + ":" + var5.m();
            Object var7 = i6.b(var5, i6.J, new Object[0]);
            Object var8 = i6.n(i6.C6);
            var10.println(var7 != var8?var6 + ":" + var7:var6);
         } else {
            var10.println("key_" + var5.g() + ":" + var5.m());
         }
      }

      for(p var18 : p.values()) {
         var10.println("soundCategory_" + var18.W() + ":" + this.b(var18));
      }

      for(j var19 : j.values()) {
         var10.println("modelPart_" + var19.x() + ":" + this.wz.contains(var19));
      }

      IOUtils.closeQuietly(var10);
      this.f();
      this.k();
   }

   public float b(p var1) {
      return this.iR.containsKey(var1)?((Float)this.iR.get(var1)).floatValue():1.0F;
   }

   public void r(p var1, float var2) {
      this.w5.n().k(var1, var2);
      this.iR.put(var1, Float.valueOf(var2));
   }

   public void k() {
      if(this.w5.sf != null) {
         int var1 = 0;

         for(j var3 : this.wz) {
            var1 |= var3.b();
         }

         this.w5.sf.x3.L((net.n2.k)(new net.m.h(this.wP, this.ij, this.i3, this.ig, var1, this.w3)));
      }

   }

   public Set y() {
      return ImmutableSet.copyOf(this.wz);
   }

   public void A(j var1, boolean var2) {
      this.wz.add(var1);
      this.k();
   }

   public void V(j var1) {
      if(this.y().contains(var1)) {
         this.wz.remove(var1);
      } else {
         this.wz.add(var1);
      }

      this.k();
   }

   public int C() {
      return this.ij >= 4?this.im:0;
   }

   public boolean G() {
      return this.w;
   }

   private void O(d.l var1, float var2) {
      if(var1 == d.l.CLOUD_HEIGHT) {
         this.wH = var2;
         this.w5.o.J();
      }

      if(var1 == d.l.AO_LEVEL) {
         this.R = var2;
         this.w5.o.n();
      }

      if(var1 == d.l.AA_LEVEL) {
         int var8 = (int)var2;
         if(!z9.Q()) {
            int[] var9 = new int[]{0, 2, 4, 6, 8, 12, 16};
            this.wh = 0;
            int var5 = 0;

            while(true) {
               int var10001 = var9.length;
               if(var8 >= var9[var5]) {
                  this.wh = var9[var5];
               }

               ++var5;
            }
         }

         z9.A(m8.i("of.message.aa.shaders1"), m8.i("of.message.aa.shaders2"));
      } else {
         if(var1 == d.l.AF_LEVEL) {
            int var3 = (int)var2;
            if(var3 > 1 && z9.Q()) {
               z9.A(m8.i("of.message.af.shaders1"), m8.i("of.message.af.shaders2"));
               return;
            }

            for(this.wB = 1; this.wB * 2 <= var3; this.wB *= 2) {
               ;
            }

            this.wB = z9.C(this.wB, 1, 16);
            this.w5.R();
         }

         if(var1 == d.l.MIPMAP_TYPE) {
            int var6 = (int)var2;
            this.iO = z9.C(var6, 0, 3);
            this.w5.R();
         }

         if(var1 == d.l.FULLSCREEN_MODE) {
            int var7 = (int)var2 - 1;
            String[] var4 = z9.R();
            if(var7 >= var4.length) {
               this.i4 = "Default";
               return;
            }

            this.i4 = var4[var7];
         }

      }
   }

   private float G(d.l var1) {
      if(var1 == d.l.CLOUD_HEIGHT) {
         return this.wH;
      } else if(var1 == d.l.AO_LEVEL) {
         return this.R;
      } else if(var1 == d.l.AA_LEVEL) {
         return (float)this.wh;
      } else if(var1 == d.l.AF_LEVEL) {
         return (float)this.wB;
      } else if(var1 == d.l.MIPMAP_TYPE) {
         return (float)this.iO;
      } else if(var1 != d.l.FRAMERATE_LIMIT) {
         if(var1 == d.l.FULLSCREEN_MODE) {
            if(this.i4.equals("Default")) {
               return 0.0F;
            } else {
               List var2 = Arrays.asList(z9.R());
               int var3 = var2.indexOf(this.i4);
               return 0.0F;
            }
         } else {
            return Float.MAX_VALUE;
         }
      } else {
         return (float)this.B == d.l.FRAMERATE_LIMIT.n() && this.wx?0.0F:(float)this.B;
      }
   }

   private void A(d.l var1, int var2) {
      if(var1 == d.l.FOG_FANCY) {
         switch(this.wo) {
         case 1:
            this.wo = 2;
            if(!z9.X()) {
               this.wo = 3;
            }
            break;
         case 2:
            this.wo = 3;
            break;
         case 3:
            this.wo = 1;
            break;
         default:
            this.wo = 1;
         }
      }

      if(var1 == d.l.FOG_START) {
         this.O += 0.2F;
         if(this.O > 0.81F) {
            this.O = 0.2F;
         }
      }

      if(var1 == d.l.SMOOTH_FPS) {
         this.u = !this.u;
      }

      if(var1 == d.l.SMOOTH_WORLD) {
         this.iV = !this.iV;
         z9.w();
      }

      if(var1 == d.l.CLOUDS) {
         ++this.wS;
         if(this.wS > 3) {
            this.wS = 0;
         }

         this.w();
         this.w5.o.J();
      }

      if(var1 == d.l.TREES) {
         this.ir = h(this.ir, iT);
         this.w5.o.n();
      }

      if(var1 == d.l.DROPPED_ITEMS) {
         ++this.iZ;
         if(this.iZ > 2) {
            this.iZ = 0;
         }
      }

      if(var1 == d.l.RAIN) {
         ++this.wv;
         if(this.wv > 3) {
            this.wv = 0;
         }
      }

      if(var1 == d.l.ANIMATED_WATER) {
         ++this.iQ;
         if(this.iQ == 1) {
            ++this.iQ;
         }

         if(this.iQ > 2) {
            this.iQ = 0;
         }
      }

      if(var1 == d.l.ANIMATED_LAVA) {
         ++this.g;
         if(this.g == 1) {
            ++this.g;
         }

         if(this.g > 2) {
            this.g = 0;
         }
      }

      if(var1 == d.l.ANIMATED_FIRE) {
         this.iJ = !this.iJ;
      }

      if(var1 == d.l.ANIMATED_PORTAL) {
         this.wi = !this.wi;
      }

      if(var1 == d.l.ANIMATED_REDSTONE) {
         this.W = !this.W;
      }

      if(var1 == d.l.ANIMATED_EXPLOSION) {
         this.wq = !this.wq;
      }

      if(var1 == d.l.ANIMATED_FLAME) {
         this.d = !this.d;
      }

      if(var1 == d.l.ANIMATED_SMOKE) {
         this.wC = !this.wC;
      }

      if(var1 == d.l.VOID_PARTICLES) {
         this.iB = !this.iB;
      }

      if(var1 == d.l.WATER_PARTICLES) {
         this.v = !this.v;
      }

      if(var1 == d.l.PORTAL_PARTICLES) {
         this.wY = !this.wY;
      }

      if(var1 == d.l.POTION_PARTICLES) {
         this.w9 = !this.w9;
      }

      if(var1 == d.l.FIREWORK_PARTICLES) {
         this.m = !this.m;
      }

      if(var1 == d.l.DRIPPING_WATER_LAVA) {
         this.tz = !this.tz;
      }

      if(var1 == d.l.ANIMATED_TERRAIN) {
         this.iz = !this.iz;
      }

      if(var1 == d.l.ANIMATED_TEXTURES) {
         this.wK = !this.wK;
      }

      if(var1 == d.l.RAIN_SPLASH) {
         this.wr = !this.wr;
      }

      if(var1 == d.l.LAGOMETER) {
         this.wN = !this.wN;
      }

      if(var1 == d.l.SHOW_FPS) {
         this.l = !this.l;
      }

      if(var1 == d.l.AUTOSAVE_TICKS) {
         this.M *= 10;
         if(this.M > '鱀') {
            this.M = 40;
         }
      }

      if(var1 == d.l.BETTER_GRASS) {
         ++this.wW;
         if(this.wW > 3) {
            this.wW = 1;
         }

         this.w5.o.n();
      }

      if(var1 == d.l.CONNECTED_TEXTURES) {
         ++this.wM;
         if(this.wM > 3) {
            this.wM = 1;
         }

         if(this.wM == 2) {
            this.w5.o.n();
         } else {
            this.w5.R();
         }
      }

      if(var1 == d.l.WEATHER) {
         this.iP = !this.iP;
      }

      if(var1 == d.l.SKY) {
         this.E = !this.E;
      }

      if(var1 == d.l.STARS) {
         this.wO = !this.wO;
      }

      if(var1 == d.l.SUN_MOON) {
         this.S = !this.S;
      }

      if(var1 == d.l.VIGNETTE) {
         ++this.wu;
         if(this.wu > 2) {
            this.wu = 0;
         }
      }

      if(var1 == d.l.CHUNK_UPDATES) {
         ++this.s;
         if(this.s > 5) {
            this.s = 1;
         }
      }

      if(var1 == d.l.CHUNK_UPDATES_DYNAMIC) {
         this.it = !this.it;
      }

      if(var1 == d.l.TIME) {
         ++this.ix;
         if(this.ix > 2) {
            this.ix = 0;
         }
      }

      if(var1 == d.l.CLEAR_WATER) {
         this.iC = !this.iC;
         this.A();
      }

      if(var1 == d.l.PROFILER) {
         this.ih = !this.ih;
      }

      if(var1 == d.l.BETTER_SNOW) {
         this.id = !this.id;
         this.w5.o.n();
      }

      if(var1 == d.l.SWAMP_COLORS) {
         this.wL = !this.wL;
         x7.Z();
         this.w5.o.n();
      }

      if(var1 == d.l.RANDOM_MOBS) {
         this.il = !this.il;
         x4.K();
      }

      if(var1 == d.l.SMOOTH_BIOMES) {
         this.A = !this.A;
         x7.Z();
         this.w5.o.n();
      }

      if(var1 == d.l.CUSTOM_FONTS) {
         this.iS = !this.iS;
         this.w5.sO.s(z9.k());
         this.w5.W.s(z9.k());
      }

      if(var1 == d.l.CUSTOM_COLORS) {
         this.N = !this.N;
         x7.w();
         this.w5.o.n();
      }

      if(var1 == d.l.CUSTOM_ITEMS) {
         this.C = !this.C;
         this.w5.R();
      }

      if(var1 == d.l.CUSTOM_SKY) {
         this.iM = !this.iM;
         wo.t();
      }

      if(var1 == d.l.SHOW_CAPES) {
         this.we = !this.we;
      }

      if(var1 == d.l.NATURAL_TEXTURES) {
         this.b = !this.b;
         w8.e();
         this.w5.o.n();
      }

      if(var1 == d.l.FAST_MATH) {
         this.wn = !this.wn;
         t.W = this.wn;
      }

      if(var1 == d.l.FAST_RENDER) {
         if(!this.w6 && z9.Q()) {
            z9.A(m8.i("of.message.fr.shaders1"), m8.i("of.message.fr.shaders2"));
            return;
         }

         this.w6 = !this.w6;
         if(this.w6) {
            this.w5.s4.q();
         }

         z9.b();
      }

      if(var1 == d.l.TRANSLUCENT_BLOCKS) {
         if(this.o == 0) {
            this.o = 1;
         } else if(this.o == 1) {
            this.o = 2;
         } else if(this.o == 2) {
            this.o = 0;
         } else {
            this.o = 0;
         }

         this.w5.o.n();
      }

      if(var1 == d.l.LAZY_CHUNK_LOADING) {
         this.I = !this.I;
         z9.d();
         if(!z9.H()) {
            this.I = false;
         }

         this.w5.o.n();
      }

      if(var1 == d.l.DYNAMIC_FOV) {
         this.w7 = !this.w7;
      }

      if(var1 == d.l.ALTERNATE_BLOCKS) {
         this.t = !this.t;
         this.w5.R();
      }

      if(var1 == d.l.DYNAMIC_LIGHTS) {
         this.T = h(this.T, e);
         oq.C(this.w5.o);
      }

      if(var1 == d.l.SCREENSHOT_SIZE) {
         ++this.i8;
         if(this.i8 > 4) {
            this.i8 = 1;
         }

         if(!ui.R()) {
            this.i8 = 1;
         }
      }

      if(var1 == d.l.CUSTOM_ENTITY_MODELS) {
         this.w8 = !this.w8;
         this.w5.R();
      }

      if(var1 == d.l.CUSTOM_GUIS) {
         this.ik = !this.ik;
         _i.x();
      }

      if(var1 == d.l.HELD_ITEM_TOOLTIPS) {
         this.J = !this.J;
      }

      if(var1 == d.l.ADVANCED_TOOLTIPS) {
         this.p = !this.p;
      }

   }

   private String E(d.l var1) {
      u();
      String var3 = b.x(var1.H(), new Object[0]) + ": ";
      if(var3 == null) {
         var3 = var1.H();
      }

      if(var1 == d.l.RENDER_DISTANCE) {
         int var11 = (int)this.T(var1);
         String var5 = b.x("of.options.renderDistance.tiny", new Object[0]);
         byte var6 = 2;
         if(var11 >= 4) {
            var5 = b.x("of.options.renderDistance.short", new Object[0]);
            var6 = 4;
         }

         if(var11 >= 8) {
            var5 = b.x("of.options.renderDistance.normal", new Object[0]);
            var6 = 8;
         }

         if(var11 >= 16) {
            var5 = b.x("of.options.renderDistance.far", new Object[0]);
            var6 = 16;
         }

         if(var11 >= 32) {
            var5 = m8.i("of.options.renderDistance.extreme");
            var6 = 32;
         }

         int var7 = this.ij - var6;
         String var8 = var5 + "+";
         return var3 + var11 + " " + var8 + "";
      } else if(var1 == d.l.FOG_FANCY) {
         switch(this.wo) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         case 3:
            return var3 + m8.o();
         default:
            return var3 + m8.o();
         }
      } else if(var1 == d.l.FOG_START) {
         return var3 + this.O;
      } else if(var1 == d.l.MIPMAP_TYPE) {
         switch(this.iO) {
         case 0:
            return var3 + m8.i("of.options.mipmap.nearest");
         case 1:
            return var3 + m8.i("of.options.mipmap.linear");
         case 2:
            return var3 + m8.i("of.options.mipmap.bilinear");
         case 3:
            return var3 + m8.i("of.options.mipmap.trilinear");
         default:
            return var3 + "of.options.mipmap.nearest";
         }
      } else if(var1 == d.l.SMOOTH_FPS) {
         return this.u?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SMOOTH_WORLD) {
         return this.iV?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CLOUDS) {
         switch(this.wS) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         case 3:
            return var3 + m8.o();
         default:
            return var3 + m8.N();
         }
      } else if(var1 == d.l.TREES) {
         switch(this.ir) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         case 3:
         default:
            return var3 + m8.N();
         case 4:
            return var3 + m8.i("of.general.smart");
         }
      } else if(var1 == d.l.DROPPED_ITEMS) {
         switch(this.iZ) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         default:
            return var3 + m8.N();
         }
      } else if(var1 == d.l.RAIN) {
         switch(this.wv) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         case 3:
            return var3 + m8.o();
         default:
            return var3 + m8.N();
         }
      } else if(var1 == d.l.ANIMATED_WATER) {
         switch(this.iQ) {
         case 1:
            return var3 + m8.i("of.options.animation.dynamic");
         case 2:
            return var3 + m8.o();
         default:
            return var3 + m8.b();
         }
      } else if(var1 == d.l.ANIMATED_LAVA) {
         switch(this.g) {
         case 1:
            return var3 + m8.i("of.options.animation.dynamic");
         case 2:
            return var3 + m8.o();
         default:
            return var3 + m8.b();
         }
      } else if(var1 == d.l.ANIMATED_FIRE) {
         return this.iJ?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_PORTAL) {
         return this.wi?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_REDSTONE) {
         return this.W?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_EXPLOSION) {
         return this.wq?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_FLAME) {
         return this.d?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_SMOKE) {
         return this.wC?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.VOID_PARTICLES) {
         return this.iB?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.WATER_PARTICLES) {
         return this.v?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.PORTAL_PARTICLES) {
         return this.wY?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.POTION_PARTICLES) {
         return this.w9?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.FIREWORK_PARTICLES) {
         return this.m?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.DRIPPING_WATER_LAVA) {
         return this.tz?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_TERRAIN) {
         return this.iz?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ANIMATED_TEXTURES) {
         return this.wK?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.RAIN_SPLASH) {
         return this.wr?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.LAGOMETER) {
         return this.wN?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SHOW_FPS) {
         return this.l?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.AUTOSAVE_TICKS) {
         return this.M <= 40?var3 + m8.i("of.options.save.default"):(this.M <= 400?var3 + m8.i("of.options.save.20s"):(this.M <= 4000?var3 + m8.i("of.options.save.3min"):var3 + m8.i("of.options.save.30min")));
      } else if(var1 == d.l.BETTER_GRASS) {
         switch(this.wW) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         default:
            return var3 + m8.o();
         }
      } else if(var1 == d.l.CONNECTED_TEXTURES) {
         switch(this.wM) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         default:
            return var3 + m8.o();
         }
      } else if(var1 == d.l.WEATHER) {
         return this.iP?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SKY) {
         return this.E?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.STARS) {
         return this.wO?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SUN_MOON) {
         return this.S?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.VIGNETTE) {
         switch(this.wu) {
         case 1:
            return var3 + m8.Q();
         case 2:
            return var3 + m8.v();
         default:
            return var3 + m8.N();
         }
      } else if(var1 == d.l.CHUNK_UPDATES) {
         return var3 + this.s;
      } else if(var1 == d.l.CHUNK_UPDATES_DYNAMIC) {
         return this.it?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.TIME) {
         return this.ix == 1?var3 + m8.i("of.options.time.dayOnly"):(this.ix == 2?var3 + m8.i("of.options.time.nightOnly"):var3 + m8.N());
      } else if(var1 == d.l.CLEAR_WATER) {
         return this.iC?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.AA_LEVEL) {
         String var10 = "";
         if(this.wh != z9.A()) {
            var10 = " (" + m8.i("of.general.restart") + ")";
         }

         return this.wh == 0?var3 + m8.o() + var10:var3 + this.wh + var10;
      } else if(var1 == d.l.AF_LEVEL) {
         return this.wB == 1?var3 + m8.o():var3 + this.wB;
      } else if(var1 == d.l.PROFILER) {
         return this.ih?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.BETTER_SNOW) {
         return this.id?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SWAMP_COLORS) {
         return this.wL?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.RANDOM_MOBS) {
         return this.il?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SMOOTH_BIOMES) {
         return this.A?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CUSTOM_FONTS) {
         return this.iS?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CUSTOM_COLORS) {
         return this.N?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CUSTOM_SKY) {
         return this.iM?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.SHOW_CAPES) {
         return this.we?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CUSTOM_ITEMS) {
         return this.C?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.NATURAL_TEXTURES) {
         return this.b?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.FAST_MATH) {
         return this.wn?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.FAST_RENDER) {
         return this.w6?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.TRANSLUCENT_BLOCKS) {
         return this.o == 1?var3 + m8.Q():(this.o == 2?var3 + m8.v():var3 + m8.N());
      } else if(var1 == d.l.LAZY_CHUNK_LOADING) {
         return this.I?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.DYNAMIC_FOV) {
         return this.w7?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ALTERNATE_BLOCKS) {
         return this.t?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.DYNAMIC_LIGHTS) {
         int var9 = D(this.T, e);
         return var3 + A(i0, var9);
      } else if(var1 == d.l.SCREENSHOT_SIZE) {
         return this.i8 <= 1?var3 + m8.N():var3 + this.i8 + "x";
      } else if(var1 == d.l.CUSTOM_ENTITY_MODELS) {
         return this.w8?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.CUSTOM_GUIS) {
         return this.ik?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.FULLSCREEN_MODE) {
         return this.i4.equals("Default")?var3 + m8.N():var3 + this.i4;
      } else if(var1 == d.l.HELD_ITEM_TOOLTIPS) {
         return this.J?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.ADVANCED_TOOLTIPS) {
         return this.p?var3 + m8.b():var3 + m8.o();
      } else if(var1 == d.l.FRAMERATE_LIMIT) {
         float var4 = this.T(var1);
         return Float.compare(var4, 0.0F) == 0?var3 + m8.i("of.options.framerateLimit.vsync"):(var4 == var1.O?var3 + b.x("options.framerateLimit.max", new Object[0]):var3 + (int)var4 + " fps");
      } else {
         return null;
      }
   }

   public void H() {
      File var1 = this.i7;
      if(!var1.exists()) {
         var1 = this.wE;
      }

      if(var1.exists()) {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), StandardCharsets.UTF_8));
         String var3 = "";

         while((var3 = var2.readLine()) != null) {
            String[] var4 = var3.split(":");
            if(var4[0].equals("ofRenderDistanceChunks") && var4.length >= 2) {
               this.ij = Integer.valueOf(var4[1]).intValue();
               this.ij = z9.C(this.ij, 2, 1024);
            }

            if(var4[0].equals("ofFogType") && var4.length >= 2) {
               this.wo = Integer.valueOf(var4[1]).intValue();
               this.wo = z9.C(this.wo, 1, 3);
            }

            if(var4[0].equals("ofFogStart") && var4.length >= 2) {
               this.O = Float.valueOf(var4[1]).floatValue();
               if(this.O < 0.2F) {
                  this.O = 0.2F;
               }

               if(this.O > 0.81F) {
                  this.O = 0.8F;
               }
            }

            if(var4[0].equals("ofMipmapType") && var4.length >= 2) {
               this.iO = Integer.valueOf(var4[1]).intValue();
               this.iO = z9.C(this.iO, 0, 3);
            }

            if(var4[0].equals("ofOcclusionFancy") && var4.length >= 2) {
               this.iy = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSmoothFps") && var4.length >= 2) {
               this.u = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSmoothWorld") && var4.length >= 2) {
               this.iV = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAoLevel") && var4.length >= 2) {
               this.R = Float.valueOf(var4[1]).floatValue();
               this.R = z9.r(this.R, 0.0F, 1.0F);
            }

            if(var4[0].equals("ofClouds") && var4.length >= 2) {
               this.wS = Integer.valueOf(var4[1]).intValue();
               this.wS = z9.C(this.wS, 0, 3);
               this.w();
            }

            if(var4[0].equals("ofCloudsHeight") && var4.length >= 2) {
               this.wH = Float.valueOf(var4[1]).floatValue();
               this.wH = z9.r(this.wH, 0.0F, 1.0F);
            }

            if(var4[0].equals("ofTrees") && var4.length >= 2) {
               this.ir = Integer.valueOf(var4[1]).intValue();
               this.ir = G(this.ir, iT);
            }

            if(var4[0].equals("ofDroppedItems") && var4.length >= 2) {
               this.iZ = Integer.valueOf(var4[1]).intValue();
               this.iZ = z9.C(this.iZ, 0, 2);
            }

            if(var4[0].equals("ofRain") && var4.length >= 2) {
               this.wv = Integer.valueOf(var4[1]).intValue();
               this.wv = z9.C(this.wv, 0, 3);
            }

            if(var4[0].equals("ofAnimatedWater") && var4.length >= 2) {
               this.iQ = Integer.valueOf(var4[1]).intValue();
               this.iQ = z9.C(this.iQ, 0, 2);
            }

            if(var4[0].equals("ofAnimatedLava") && var4.length >= 2) {
               this.g = Integer.valueOf(var4[1]).intValue();
               this.g = z9.C(this.g, 0, 2);
            }

            if(var4[0].equals("ofAnimatedFire") && var4.length >= 2) {
               this.iJ = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedPortal") && var4.length >= 2) {
               this.wi = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedRedstone") && var4.length >= 2) {
               this.W = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedExplosion") && var4.length >= 2) {
               this.wq = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedFlame") && var4.length >= 2) {
               this.d = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedSmoke") && var4.length >= 2) {
               this.wC = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofVoidParticles") && var4.length >= 2) {
               this.iB = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofWaterParticles") && var4.length >= 2) {
               this.v = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofPortalParticles") && var4.length >= 2) {
               this.wY = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofPotionParticles") && var4.length >= 2) {
               this.w9 = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofFireworkParticles") && var4.length >= 2) {
               this.m = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofDrippingWaterLava") && var4.length >= 2) {
               this.tz = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedTerrain") && var4.length >= 2) {
               this.iz = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAnimatedTextures") && var4.length >= 2) {
               this.wK = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofRainSplash") && var4.length >= 2) {
               this.wr = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofLagometer") && var4.length >= 2) {
               this.wN = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofShowFps") && var4.length >= 2) {
               this.l = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAutoSaveTicks") && var4.length >= 2) {
               this.M = Integer.valueOf(var4[1]).intValue();
               this.M = z9.C(this.M, 40, '鱀');
            }

            if(var4[0].equals("ofBetterGrass") && var4.length >= 2) {
               this.wW = Integer.valueOf(var4[1]).intValue();
               this.wW = z9.C(this.wW, 1, 3);
            }

            if(var4[0].equals("ofConnectedTextures") && var4.length >= 2) {
               this.wM = Integer.valueOf(var4[1]).intValue();
               this.wM = z9.C(this.wM, 1, 3);
            }

            if(var4[0].equals("ofWeather") && var4.length >= 2) {
               this.iP = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSky") && var4.length >= 2) {
               this.E = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofStars") && var4.length >= 2) {
               this.wO = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSunMoon") && var4.length >= 2) {
               this.S = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofVignette") && var4.length >= 2) {
               this.wu = Integer.valueOf(var4[1]).intValue();
               this.wu = z9.C(this.wu, 0, 2);
            }

            if(var4[0].equals("ofChunkUpdates") && var4.length >= 2) {
               this.s = Integer.valueOf(var4[1]).intValue();
               this.s = z9.C(this.s, 1, 5);
            }

            if(var4[0].equals("ofChunkUpdatesDynamic") && var4.length >= 2) {
               this.it = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofTime") && var4.length >= 2) {
               this.ix = Integer.valueOf(var4[1]).intValue();
               this.ix = z9.C(this.ix, 0, 2);
            }

            if(var4[0].equals("ofClearWater") && var4.length >= 2) {
               this.iC = Boolean.valueOf(var4[1]).booleanValue();
               this.A();
            }

            if(var4[0].equals("ofAaLevel") && var4.length >= 2) {
               this.wh = Integer.valueOf(var4[1]).intValue();
               this.wh = z9.C(this.wh, 0, 16);
            }

            if(var4[0].equals("ofAfLevel") && var4.length >= 2) {
               this.wB = Integer.valueOf(var4[1]).intValue();
               this.wB = z9.C(this.wB, 1, 16);
            }

            if(var4[0].equals("ofProfiler") && var4.length >= 2) {
               this.ih = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofBetterSnow") && var4.length >= 2) {
               this.id = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSwampColors") && var4.length >= 2) {
               this.wL = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofRandomMobs") && var4.length >= 2) {
               this.il = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofSmoothBiomes") && var4.length >= 2) {
               this.A = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofCustomFonts") && var4.length >= 2) {
               this.iS = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofCustomColors") && var4.length >= 2) {
               this.N = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofCustomItems") && var4.length >= 2) {
               this.C = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofCustomSky") && var4.length >= 2) {
               this.iM = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofShowCapes") && var4.length >= 2) {
               this.we = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofNaturalTextures") && var4.length >= 2) {
               this.b = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofLazyChunkLoading") && var4.length >= 2) {
               this.I = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofDynamicFov") && var4.length >= 2) {
               this.w7 = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofAlternateBlocks") && var4.length >= 2) {
               this.t = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofDynamicLights") && var4.length >= 2) {
               this.T = Integer.valueOf(var4[1]).intValue();
               this.T = G(this.T, e);
            }

            if(var4[0].equals("ofScreenshotSize") && var4.length >= 2) {
               this.i8 = Integer.valueOf(var4[1]).intValue();
               this.i8 = z9.C(this.i8, 1, 4);
            }

            if(var4[0].equals("ofCustomEntityModels") && var4.length >= 2) {
               this.w8 = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofCustomGuis") && var4.length >= 2) {
               this.ik = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofFullscreenMode") && var4.length >= 2) {
               this.i4 = var4[1];
            }

            if(var4[0].equals("ofFastMath") && var4.length >= 2) {
               this.wn = Boolean.valueOf(var4[1]).booleanValue();
               t.W = this.wn;
            }

            if(var4[0].equals("ofFastRender") && var4.length >= 2) {
               this.w6 = Boolean.valueOf(var4[1]).booleanValue();
            }

            if(var4[0].equals("ofTranslucentBlocks") && var4.length >= 2) {
               this.o = Integer.valueOf(var4[1]).intValue();
               this.o = z9.C(this.o, 0, 2);
            }

            if(var4[0].equals("key_" + this.i1.g())) {
               this.i1.s(Integer.parseInt(var4[1]));
            }
         }

         h.G();
         var2.close();
      }
   }

   public void f() {
      PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.i7), StandardCharsets.UTF_8));
      var1.println("ofRenderDistanceChunks:" + this.ij);
      var1.println("ofFogType:" + this.wo);
      var1.println("ofFogStart:" + this.O);
      var1.println("ofMipmapType:" + this.iO);
      var1.println("ofOcclusionFancy:" + this.iy);
      var1.println("ofSmoothFps:" + this.u);
      var1.println("ofSmoothWorld:" + this.iV);
      var1.println("ofAoLevel:" + this.R);
      var1.println("ofClouds:" + this.wS);
      var1.println("ofCloudsHeight:" + this.wH);
      var1.println("ofTrees:" + this.ir);
      var1.println("ofDroppedItems:" + this.iZ);
      var1.println("ofRain:" + this.wv);
      var1.println("ofAnimatedWater:" + this.iQ);
      var1.println("ofAnimatedLava:" + this.g);
      var1.println("ofAnimatedFire:" + this.iJ);
      var1.println("ofAnimatedPortal:" + this.wi);
      var1.println("ofAnimatedRedstone:" + this.W);
      var1.println("ofAnimatedExplosion:" + this.wq);
      var1.println("ofAnimatedFlame:" + this.d);
      var1.println("ofAnimatedSmoke:" + this.wC);
      var1.println("ofVoidParticles:" + this.iB);
      var1.println("ofWaterParticles:" + this.v);
      var1.println("ofPortalParticles:" + this.wY);
      var1.println("ofPotionParticles:" + this.w9);
      var1.println("ofFireworkParticles:" + this.m);
      var1.println("ofDrippingWaterLava:" + this.tz);
      var1.println("ofAnimatedTerrain:" + this.iz);
      var1.println("ofAnimatedTextures:" + this.wK);
      var1.println("ofRainSplash:" + this.wr);
      var1.println("ofLagometer:" + this.wN);
      var1.println("ofShowFps:" + this.l);
      var1.println("ofAutoSaveTicks:" + this.M);
      var1.println("ofBetterGrass:" + this.wW);
      var1.println("ofConnectedTextures:" + this.wM);
      var1.println("ofWeather:" + this.iP);
      var1.println("ofSky:" + this.E);
      var1.println("ofStars:" + this.wO);
      var1.println("ofSunMoon:" + this.S);
      var1.println("ofVignette:" + this.wu);
      var1.println("ofChunkUpdates:" + this.s);
      var1.println("ofChunkUpdatesDynamic:" + this.it);
      var1.println("ofTime:" + this.ix);
      var1.println("ofClearWater:" + this.iC);
      var1.println("ofAaLevel:" + this.wh);
      var1.println("ofAfLevel:" + this.wB);
      var1.println("ofProfiler:" + this.ih);
      var1.println("ofBetterSnow:" + this.id);
      var1.println("ofSwampColors:" + this.wL);
      var1.println("ofRandomMobs:" + this.il);
      var1.println("ofSmoothBiomes:" + this.A);
      var1.println("ofCustomFonts:" + this.iS);
      var1.println("ofCustomColors:" + this.N);
      var1.println("ofCustomItems:" + this.C);
      var1.println("ofCustomSky:" + this.iM);
      var1.println("ofShowCapes:" + this.we);
      var1.println("ofNaturalTextures:" + this.b);
      var1.println("ofLazyChunkLoading:" + this.I);
      var1.println("ofDynamicFov:" + this.w7);
      var1.println("ofAlternateBlocks:" + this.t);
      var1.println("ofDynamicLights:" + this.T);
      var1.println("ofScreenshotSize:" + this.i8);
      var1.println("ofCustomEntityModels:" + this.w8);
      var1.println("ofCustomGuis:" + this.ik);
      var1.println("ofFullscreenMode:" + this.i4);
      var1.println("ofFastMath:" + this.wn);
      var1.println("ofFastRender:" + this.w6);
      var1.println("ofTranslucentBlocks:" + this.o);
      var1.println("key_" + this.i1.g() + ":" + this.i1.m());
      var1.close();
   }

   private void w() {
      switch(this.wS) {
      case 1:
         this.im = 1;
         break;
      case 2:
         this.im = 2;
         break;
      case 3:
         this.im = 0;
         break;
      default:
         if(this.tR) {
            this.im = 2;
         } else {
            this.im = 1;
         }
      }

   }

   public void I() {
      this.ij = 8;
      this.Y = true;
      this.iW = false;
      this.B = (int)d.l.FRAMERATE_LIMIT.n();
      this.wx = false;
      this.W();
      this.z = 4;
      this.tR = true;
      this.wD = 2;
      this.im = 2;
      this.is = 70.0F;
      this.i2 = 0.0F;
      this.iL = 0;
      this.wQ = 0;
      this.J = true;
      this.ip = false;
      this.in = false;
      this.wo = 1;
      this.O = 0.8F;
      this.iO = 0;
      this.iy = false;
      this.u = false;
      z9.d();
      this.iV = z9.H();
      this.I = z9.H();
      this.wn = false;
      this.w6 = false;
      this.o = 0;
      this.w7 = true;
      this.t = true;
      this.T = 3;
      this.i8 = 1;
      this.w8 = true;
      this.ik = true;
      this.R = 1.0F;
      this.wh = 0;
      this.wB = 1;
      this.wS = 0;
      this.wH = 0.0F;
      this.ir = 0;
      this.wv = 0;
      this.wW = 3;
      this.M = 4000;
      this.wN = false;
      this.l = false;
      this.ih = false;
      this.iP = true;
      this.E = true;
      this.wO = true;
      this.S = true;
      this.wu = 0;
      this.s = 1;
      this.it = false;
      this.ix = 0;
      this.iC = false;
      this.id = false;
      this.i4 = "Default";
      this.wL = true;
      this.il = true;
      this.A = true;
      this.iS = true;
      this.N = true;
      this.C = true;
      this.iM = true;
      this.we = true;
      this.wM = 2;
      this.b = false;
      this.iQ = 0;
      this.g = 0;
      this.iJ = true;
      this.wi = true;
      this.W = true;
      this.wq = true;
      this.d = true;
      this.wC = true;
      this.iB = true;
      this.v = true;
      this.wr = true;
      this.wY = true;
      this.w9 = true;
      this.m = true;
      this.tz = true;
      this.iz = true;
      this.wK = true;
      oz.p(oz.e0);
      oz.K = 0;
      oz.t();
      oz.j();
      this.A();
      this.w5.R();
      this.m();
   }

   public void W() {
      Display.setVSyncEnabled(this.wx);
   }

   private void A() {
      if(this.w5.w() && this.w5.V() != null) {
         z9.g = true;
      }

      by.p(this, this.w5.s8);
   }

   public void I(boolean var1) {
      byte var2 = 0;
      this.iQ = var2;
      this.g = var2;
      this.iJ = var1;
      this.wi = var1;
      this.W = var1;
      this.wq = var1;
      this.d = var1;
      this.wC = var1;
      this.iB = var1;
      this.v = var1;
      this.wr = var1;
      this.wY = var1;
      this.w9 = var1;
      this.m = var1;
      this.wQ = 0;
      this.tz = var1;
      this.iz = var1;
      this.wK = var1;
   }

   private static int h(int var0, int[] var1) {
      int var2 = D(var0, var1);
      return var1[0];
   }

   private static int G(int var0, int[] var1) {
      int var2 = D(var0, var1);
      return var1[0];
   }

   private static int D(int var0, int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private void T() {
      if(i6.Mn.I() && i6.CK.r()) {
         Object var1 = i6.n(i6.Mn);
         i6.b(this.ib, i6.CK, new Object[]{var1});
         i6.b(this.w2, i6.CK, new Object[]{var1});
         i6.b(this.P, i6.CK, new Object[]{var1});
         i6.b(this.tT, i6.CK, new Object[]{var1});
         i6.b(this.iD, i6.CK, new Object[]{var1});
         i6.b(this.w0, i6.CK, new Object[]{var1});
         i6.b(this.iE, i6.CK, new Object[]{var1});
         i6.b(this.Q, i6.CK, new Object[]{var1});
         i6.b(this.wg, i6.CK, new Object[]{var1});
         i6.b(this.G, i6.CK, new Object[]{var1});
         i6.b(this.wy, i6.CK, new Object[]{var1});
         i6.b(this.L, i6.CK, new Object[]{var1});
         i6.b(this.wb, i6.CK, new Object[]{var1});
         i6.b(this.wU, i6.CK, new Object[]{var1});
      }

   }

   public void l() {
      if(this.y) {
         this.w5.m();
         this.y = false;
      }

   }

   static {
      O((String)null);
   }

   public static void O(String var0) {
      wF = var0;
   }

   public static String u() {
      return wF;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum l {
      INVERT_MOUSE("options.invertMouse", false, true),
      SENSITIVITY("options.sensitivity", true, false),
      FOV("options.fov", true, false, 30.0F, 110.0F, 1.0F),
      GAMMA("options.gamma", true, false),
      SATURATION("options.saturation", true, false),
      RENDER_DISTANCE("options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
      VIEW_BOBBING("options.viewBobbing", false, true),
      ANAGLYPH("options.anaglyph", false, true),
      FRAMERATE_LIMIT("options.framerateLimit", true, false, 0.0F, 260.0F, 5.0F),
      FBO_ENABLE("options.fboEnable", false, true),
      RENDER_CLOUDS("options.renderClouds", false, false),
      GRAPHICS("options.graphics", false, false),
      AMBIENT_OCCLUSION("options.ao", false, false),
      GUI_SCALE("options.guiScale", false, false),
      PARTICLES("options.particles", false, false),
      CHAT_VISIBILITY("options.chat.visibility", false, false),
      CHAT_COLOR("options.chat.color", false, true),
      CHAT_LINKS("options.chat.links", false, true),
      CHAT_OPACITY("options.chat.opacity", true, false),
      CHAT_LINKS_PROMPT("options.chat.links.prompt", false, true),
      SNOOPER_ENABLED("options.snooper", false, true),
      USE_FULLSCREEN("options.fullscreen", false, true),
      ENABLE_VSYNC("options.vsync", false, true),
      USE_VBO("options.vbo", false, true),
      TOUCHSCREEN("options.touchscreen", false, true),
      CHAT_SCALE("options.chat.scale", true, false),
      CHAT_WIDTH("options.chat.width", true, false),
      CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),
      CHAT_HEIGHT_UNFOCUSED("options.chat.height.unfocused", true, false),
      MIPMAP_LEVELS("options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
      FORCE_UNICODE_FONT("options.forceUnicodeFont", false, true),
      REDUCED_DEBUG_INFO("options.reducedDebugInfo", false, true),
      ENTITY_SHADOWS("options.entityShadows", false, true),
      MAIN_HAND("options.mainHand", false, false),
      ATTACK_INDICATOR("options.attackIndicator", false, false),
      ENABLE_WEAK_ATTACKS("options.enableWeakAttacks", false, true),
      SHOW_SUBTITLES("options.showSubtitles", false, true),
      REALMS_NOTIFICATIONS("options.realmsNotifications", false, true),
      AUTO_JUMP("options.autoJump", false, true),
      NARRATOR("options.narrator", false, false),
      FOG_FANCY("of.options.FOG_FANCY", false, false),
      FOG_START("of.options.FOG_START", false, false),
      MIPMAP_TYPE("of.options.MIPMAP_TYPE", true, false, 0.0F, 3.0F, 1.0F),
      SMOOTH_FPS("of.options.SMOOTH_FPS", false, false),
      CLOUDS("of.options.CLOUDS", false, false),
      CLOUD_HEIGHT("of.options.CLOUD_HEIGHT", true, false),
      TREES("of.options.TREES", false, false),
      RAIN("of.options.RAIN", false, false),
      ANIMATED_WATER("of.options.ANIMATED_WATER", false, false),
      ANIMATED_LAVA("of.options.ANIMATED_LAVA", false, false),
      ANIMATED_FIRE("of.options.ANIMATED_FIRE", false, false),
      ANIMATED_PORTAL("of.options.ANIMATED_PORTAL", false, false),
      AO_LEVEL("of.options.AO_LEVEL", true, false),
      LAGOMETER("of.options.LAGOMETER", false, false),
      SHOW_FPS("of.options.SHOW_FPS", false, false),
      AUTOSAVE_TICKS("of.options.AUTOSAVE_TICKS", false, false),
      BETTER_GRASS("of.options.BETTER_GRASS", false, false),
      ANIMATED_REDSTONE("of.options.ANIMATED_REDSTONE", false, false),
      ANIMATED_EXPLOSION("of.options.ANIMATED_EXPLOSION", false, false),
      ANIMATED_FLAME("of.options.ANIMATED_FLAME", false, false),
      ANIMATED_SMOKE("of.options.ANIMATED_SMOKE", false, false),
      WEATHER("of.options.WEATHER", false, false),
      SKY("of.options.SKY", false, false),
      STARS("of.options.STARS", false, false),
      SUN_MOON("of.options.SUN_MOON", false, false),
      VIGNETTE("of.options.VIGNETTE", false, false),
      CHUNK_UPDATES("of.options.CHUNK_UPDATES", false, false),
      CHUNK_UPDATES_DYNAMIC("of.options.CHUNK_UPDATES_DYNAMIC", false, false),
      TIME("of.options.TIME", false, false),
      CLEAR_WATER("of.options.CLEAR_WATER", false, false),
      SMOOTH_WORLD("of.options.SMOOTH_WORLD", false, false),
      VOID_PARTICLES("of.options.VOID_PARTICLES", false, false),
      WATER_PARTICLES("of.options.WATER_PARTICLES", false, false),
      RAIN_SPLASH("of.options.RAIN_SPLASH", false, false),
      PORTAL_PARTICLES("of.options.PORTAL_PARTICLES", false, false),
      POTION_PARTICLES("of.options.POTION_PARTICLES", false, false),
      FIREWORK_PARTICLES("of.options.FIREWORK_PARTICLES", false, false),
      PROFILER("of.options.PROFILER", false, false),
      DRIPPING_WATER_LAVA("of.options.DRIPPING_WATER_LAVA", false, false),
      BETTER_SNOW("of.options.BETTER_SNOW", false, false),
      FULLSCREEN_MODE("of.options.FULLSCREEN_MODE", true, false, 0.0F, (float)z9.V().length, 1.0F),
      ANIMATED_TERRAIN("of.options.ANIMATED_TERRAIN", false, false),
      SWAMP_COLORS("of.options.SWAMP_COLORS", false, false),
      RANDOM_MOBS("of.options.RANDOM_MOBS", false, false),
      SMOOTH_BIOMES("of.options.SMOOTH_BIOMES", false, false),
      CUSTOM_FONTS("of.options.CUSTOM_FONTS", false, false),
      CUSTOM_COLORS("of.options.CUSTOM_COLORS", false, false),
      SHOW_CAPES("of.options.SHOW_CAPES", false, false),
      CONNECTED_TEXTURES("of.options.CONNECTED_TEXTURES", false, false),
      CUSTOM_ITEMS("of.options.CUSTOM_ITEMS", false, false),
      AA_LEVEL("of.options.AA_LEVEL", true, false, 0.0F, 16.0F, 1.0F),
      AF_LEVEL("of.options.AF_LEVEL", true, false, 1.0F, 16.0F, 1.0F),
      ANIMATED_TEXTURES("of.options.ANIMATED_TEXTURES", false, false),
      NATURAL_TEXTURES("of.options.NATURAL_TEXTURES", false, false),
      HELD_ITEM_TOOLTIPS("of.options.HELD_ITEM_TOOLTIPS", false, false),
      DROPPED_ITEMS("of.options.DROPPED_ITEMS", false, false),
      LAZY_CHUNK_LOADING("of.options.LAZY_CHUNK_LOADING", false, false),
      CUSTOM_SKY("of.options.CUSTOM_SKY", false, false),
      FAST_MATH("of.options.FAST_MATH", false, false),
      FAST_RENDER("of.options.FAST_RENDER", false, false),
      TRANSLUCENT_BLOCKS("of.options.TRANSLUCENT_BLOCKS", false, false),
      DYNAMIC_FOV("of.options.DYNAMIC_FOV", false, false),
      DYNAMIC_LIGHTS("of.options.DYNAMIC_LIGHTS", false, false),
      ALTERNATE_BLOCKS("of.options.ALTERNATE_BLOCKS", false, false),
      CUSTOM_ENTITY_MODELS("of.options.CUSTOM_ENTITY_MODELS", false, false),
      ADVANCED_TOOLTIPS("of.options.ADVANCED_TOOLTIPS", false, false),
      SCREENSHOT_SIZE("of.options.SCREENSHOT_SIZE", false, false),
      CUSTOM_GUIS("of.options.CUSTOM_GUIS", false, false);

      private final boolean f;
      private final boolean e;
      private final String t;
      private final float K;
      private final float A;
      private float O;

      public static d.l i(int var0) {
         d.l[] var2 = values();
         d.wF;
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            d.l var5 = var2[var4];
            if(var5.p() == var0) {
               return var5;
            }

            ++var4;
         }

         return null;
      }

      private l(String var3, boolean var4, boolean var5) {
         this(var3, var4, var5, 0.0F, 1.0F, 0.0F);
      }

      private l(String var3, boolean var4, boolean var5, float var6, float var7, float var8) {
         this.t = var3;
         this.f = var4;
         this.e = var5;
         this.A = var6;
         this.O = var7;
         this.K = var8;
      }

      public boolean k() {
         return this.f;
      }

      public boolean a() {
         return this.e;
      }

      public int p() {
         return this.ordinal();
      }

      public String H() {
         return this.t;
      }

      public float k() {
         return this.A;
      }

      public float n() {
         return this.O;
      }

      public void u(float var1) {
         this.O = var1;
      }

      public float f(float var1) {
         return t.T((this.R(var1) - this.A) / (this.O - this.A), 0.0F, 1.0F);
      }

      public float y(float var1) {
         return this.R(this.A + (this.O - this.A) * t.T(var1, 0.0F, 1.0F));
      }

      public float R(float var1) {
         var1 = this.T(var1);
         return t.T(var1, this.A, this.O);
      }

      private float T(float var1) {
         String var2 = d.wF;
         if(this.K > 0.0F) {
            var1 = this.K * (float)Math.round(var1 / this.K);
         }

         return var1;
      }

      // $FF: synthetic method
      static float access$100(d.l var0) {
         return var0.A;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
