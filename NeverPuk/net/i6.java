package net;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;
import net._4;
import net.b6;
import net.bd;
import net.m3;
import net.mf;
import net.ow;
import net.w4;
import net.x8;
import net.z9;
import net.c5.s;
import net.c5.t;
import net.c5.u;
import net.c9.k;
import net.n0.y;
import net.n_.f;
import net.ne.a;
import net.ne.l;
import net.ns.i;
import net.r.h;
import net.u.j;
import net.u.p;
import net.y.n;
import net.y0.b;
import net.y0.ch;
import net.y0.co;
import net.y0.cu;
import net.y0.o;
import net.y6.e4;
import net.y6.e7;
import net.y6.e8;
import net.y6.e9;
import net.y6.ea;
import net.y6.eb;
import net.y6.ec;
import net.y6.ef;
import net.y6.eh;
import net.y6.ei;
import net.y6.ek;
import net.y6.el;
import net.y6.eo;
import net.y6.eq;
import net.y6.er;
import net.y6.es;
import net.y6.et;
import net.y6.eu;
import net.y6.ev;
import net.y6.ez;
import net.y6.g;
import net.y6.jb;
import net.y6.m;
import net.ym.d;
import net.ym.x;
import net.yv.c;
import net.yv.q;
import net.yv.r;
import net.yw.e;
import net.yz.ac;
import net.z.tt;
import net.z.tu;

public class i6 {
   public static m3 uW = new m3("net.minecraftforge.client.model.Attributes");
   public static mf D = new mf(uW, "DEFAULT_BAKED_FORMAT");
   public static m3 u0 = new m3("mods.betterfoliage.client.BetterFoliageClient");
   public static m3 C3 = new m3("net.minecraftforge.fml.common.asm.transformers.BlamingTransformer");
   public static ow BG = new ow(C3, "onCrash");
   public static m3 u3 = new m3("net.minecraftforge.event.world.ChunkWatchEvent$UnWatch");
   public static w4 u9 = new w4(u3, new Class[]{p.class, h.class});
   public static m3 uK = new m3("net.minecraftforge.fml.relauncher.CoreModManager");
   public static ow B9 = new ow(uK, "onCrash");
   public static m3 N = new m3("net.minecraftforge.common.DimensionManager");
   public static ow Mz = new ow(N, "createProviderFor");
   public static ow q = new ow(N, "getStaticDimensionIDs");
   public static m3 n = new m3("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
   public static w4 Cu = new w4(n, new Class[]{tu.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
   public static m3 MZ = new m3("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
   public static w4 Bp = new w4(MZ, new Class[]{tu.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
   public static m3 u2 = new m3("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
   public static w4 MR = new w4(u2, new Class[]{n.class, l.class, net.yw.n.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
   public static ow ut = new ow(u2, "getRoll");
   public static ow u1 = new ow(u2, "getPitch");
   public static ow B0 = new ow(u2, "getYaw");
   public static m3 us = new m3("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
   public static w4 Ue = new w4(us, new Class[]{n.class, l.class, net.yw.n.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
   public static ow ug = new ow(us, "getRed");
   public static ow U8 = new ow(us, "getGreen");
   public static ow CY = new ow(us, "getBlue");
   public static m3 u4 = new m3("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
   public static w4 Z = new w4(u4, new Class[]{n.class, l.class, net.yw.n.class, Double.TYPE, Integer.TYPE, Float.TYPE});
   public static m3 u8 = new m3("net.minecraftforge.fml.common.eventhandler.Event");
   public static ow BF = new ow(u8, "isCanceled");
   public static m3 c = new m3("net.minecraftforge.fml.common.eventhandler.EventBus");
   public static ow MD = new ow(c, "post");
   public static m3 I = new m3("net.minecraftforge.fml.common.eventhandler.Event$Result");
   public static mf C8 = new mf(I, "DENY");
   public static mf ud = new mf(I, "ALLOW");
   public static mf UY = new mf(I, "DEFAULT");
   public static m3 Cx = new m3("net.minecraftforge.common.property.ExtendedBlockState");
   public static w4 ua = new w4(Cx, new Class[]{net.y9.l.class, net.yr.h[].class, _4[].class});
   public static m3 v = new m3("net.minecraftforge.fml.client.FMLClientHandler");
   public static ow uJ = new ow(v, "instance");
   public static ow MW = new ow(v, "isLoading");
   public static ow K = new ow(v, "trackBrokenTexture");
   public static ow C0 = new ow(v, "trackMissingTexture");
   public static m3 BM = new m3("net.minecraftforge.fml.common.FMLCommonHandler");
   public static ow CO = new ow(BM, "callFuture");
   public static ow uz = new ow(BM, "enhanceCrashReport");
   public static ow BI = new ow(BM, "getBrandings");
   public static ow u5 = new ow(BM, "handleServerAboutToStart");
   public static ow Cj = new ow(BM, "handleServerStarting");
   public static ow MN = new ow(BM, "instance");
   public static m3 CJ = new m3(i.class);
   public static ow MA = new ow(CJ, "getWaterColorMultiplier");
   public static m3 X = new m3(net.y9.l.class);
   public static ow Md = new ow(X, "addDestroyEffects");
   public static ow uR = new ow(X, "addHitEffects");
   public static ow Uj = new ow(X, "canCreatureSpawn");
   public static ow j = new ow(X, "canRenderInLayer", new Class[]{net.yw.n.class, ac.class});
   public static ow CX = new ow(X, "doesSideBlockRendering");
   public static ow uY = new ow(X, "getBedDirection");
   public static ow Br = new ow(X, "getExtendedState");
   public static ow ue = new ow(X, "getFogColor");
   public static ow MT = new ow(X, "getLightOpacity", new Class[]{net.yw.n.class, net.yv.o8.class, j.class});
   public static ow Mx = new ow(X, "getLightValue", new Class[]{net.yw.n.class, net.yv.o8.class, j.class});
   public static ow UN = new ow(X, "getSoundType", new Class[]{net.yw.n.class, r.class, j.class, l.class});
   public static ow C5 = new ow(X, "hasTileEntity", new Class[]{net.yw.n.class});
   public static ow CZ = new ow(X, "isAir");
   public static ow B2 = new ow(X, "isBed");
   public static ow g = new ow(X, "isBedFoot");
   public static ow By = new ow(X, "isSideSolid");
   public static m3 E = new m3(e.class);
   public static ow BO = new ow(E, "getLightValue", new Class[]{net.yv.o8.class, j.class});
   public static m3 Bu = new m3(q.class);
   public static ow C9 = new ow(Bu, "isSideSolid");
   public static m3 Uy = new m3(l.class);
   public static ow BH = new ow(Uy, "canRiderInteract");
   public static mf Cr = new mf(Uy, "captureDrops");
   public static mf BZ = new mf(Uy, "capturedDrops");
   public static ow Mq = new ow(Uy, "shouldRenderInPass");
   public static ow Be = new ow(Uy, "shouldRiderSit");
   public static m3 Bt = new m3("net.minecraftforge.event.ForgeEventFactory");
   public static ow U3 = new ow(Bt, "canEntityDespawn");
   public static ow h = new ow(Bt, "renderBlockOverlay");
   public static ow CI = new ow(Bt, "renderFireOverlay");
   public static ow MC = new ow(Bt, "renderWaterOverlay");
   public static m3 My = new m3("net.minecraftforge.common.ForgeHooks");
   public static ow S = new ow(My, "onLivingAttack");
   public static ow a = new ow(My, "onLivingDeath");
   public static ow Bg = new ow(My, "onLivingDrops");
   public static ow M3 = new ow(My, "onLivingFall");
   public static ow Bq = new ow(My, "onLivingHurt");
   public static ow Cw = new ow(My, "onLivingJump");
   public static ow Mh = new ow(My, "onLivingSetAttackTarget");
   public static ow ux = new ow(My, "onLivingUpdate");
   public static m3 MI = new m3("net.minecraftforge.client.ForgeHooksClient");
   public static ow C_ = new ow(MI, "applyTransform", new Class[]{bd.class, Optional.class});
   public static ow Mj = new ow(MI, "applyUVLock");
   public static ow V = new ow(MI, "dispatchRenderLast");
   public static ow Mr = new ow(MI, "drawScreen");
   public static ow uc = new ow(MI, "fillNormal");
   public static ow BE = new ow(MI, "handleCameraTransforms");
   public static ow Q = new ow(MI, "getArmorModel");
   public static ow uQ = new ow(MI, "getArmorTexture");
   public static ow e = new ow(MI, "getFogDensity");
   public static ow CC = new ow(MI, "getFOVModifier");
   public static ow U_ = new ow(MI, "getMatrix", new Class[]{d.class});
   public static ow u = new ow(MI, "getOffsetFOV");
   public static ow CF = new ow(MI, "loadEntityShader");
   public static ow M2 = new ow(MI, "onDrawBlockHighlight");
   public static ow Co = new ow(MI, "onFogRender");
   public static ow M_ = new ow(MI, "onScreenshot");
   public static ow B6 = new ow(MI, "onTextureStitchedPre");
   public static ow uU = new ow(MI, "onTextureStitchedPost");
   public static ow Mi = new ow(MI, "orientBedCamera");
   public static ow o = new ow(MI, "putQuadColor");
   public static ow C = new ow(MI, "renderFirstPersonHand");
   public static ow s = new ow(MI, "renderMainMenu");
   public static ow t = new ow(MI, "renderSpecificFirstPersonHand");
   public static ow Mo = new ow(MI, "setRenderLayer");
   public static ow Ct = new ow(MI, "setRenderPass");
   public static ow uP = new ow(MI, "shouldCauseReequipAnimation");
   public static ow Bb = new ow(MI, "transform");
   public static m3 Ml = new m3(y.class);
   public static mf MF = new mf(Ml, "delegate");
   public static ow uE = new ow(Ml, "getDurabilityForDisplay");
   public static ow T = new ow(Ml, "getRGBDurabilityForDisplay");
   public static ow UA = new ow(Ml, "isShield");
   public static ow d = new ow(Ml, "onEntitySwing");
   public static ow w = new ow(Ml, "shouldCauseReequipAnimation");
   public static ow W = new ow(Ml, "showDurabilityBar");
   public static m3 BA = new m3(net.ym.l.class);
   public static ow BV = new ow(BA, "handleItemState");
   public static m3 M = new m3(net.n0.j.class);
   public static ow uG = new ow(M, "hasOverlay");
   public static m3 Bj = new m3(net.nr.h.class);
   public static ow CK = new ow(Bj, "setKeyConflictContext");
   public static ow uC = new ow(Bj, "setKeyModifierAndCode");
   public static ow J = new ow(Bj, "getKeyModifier");
   public static m3 U6 = new m3("net.minecraftforge.common.ForgeModContainer");
   public static mf uh = new mf(U6, "forgeLightPipelineEnabled");
   public static m3 Mg = new m3(x.class);
   public static ow Ci = new ow(Mg, "parseFromReader", new Class[]{Reader.class, net.yz.m_.class});
   public static m3 uN = new m3(f.class);
   public static ow CQ = uN.X("shouldRenderHUD");
   public static ow Ba = uN.X("renderHUDEffect");
   public static m3 BU = new m3(net.n_.i.class);
   public static ow Ch = new ow(BU, "isCurativeItem");
   public static m3 Bn = new m3(net.ni.v.class);
   public static ow H = new ow(Bn, "canRenderBreaking");
   public static ow C1 = new ow(Bn, "getRenderBoundingBox");
   public static ow Cc = new ow(Bn, "hasFastRenderer");
   public static ow uo = new ow(Bn, "shouldRenderInPass");
   public static m3 uH = new m3(net.y8.h.class);
   public static ow L = new ow(uH, "preDraw");
   public static ow CH = new ow(uH, "postDraw");
   public static m3 Cb = new m3(r.class);
   public static ow uM = new ow(Cb, "countEntities", new Class[]{net.ne.q.class, Boolean.TYPE});
   public static ow Cg = new ow(Cb, "getPerWorldStorage");
   public static ow B3 = new ow(Cb, "initCapabilities");
   public static m3 MO = new m3(c.class);
   public static ow Bi = new ow(MO, "getCloudRenderer");
   public static ow BQ = new ow(MO, "getSkyRenderer");
   public static ow Bw = new ow(MO, "getWeatherRenderer");
   public static ow r = new ow(MO, "getLightmapColors");
   public static m3 Ck = new m3("net.minecraftforge.fml.client.GuiModList");
   public static w4 ui = new w4(Ck, new Class[]{tu.class});
   public static m3 Bs = new m3("net.minecraftforge.common.property.IExtendedBlockState");
   public static ow Ut = new ow(Bs, "getClean");
   public static m3 i = new m3("net.minecraftforge.client.model.IModel");
   public static ow Bh = new ow(i, "getTextures");
   public static m3 CS = new m3("net.minecraftforge.client.IRenderHandler");
   public static ow MV = new ow(CS, "render");
   public static m3 R = new m3("net.minecraftforge.client.ItemModelMesherForge");
   public static w4 uD = new w4(R, new Class[]{net.ym.v.class});
   public static m3 MK = new m3("net.minecraftforge.client.settings.KeyConflictContext");
   public static mf Mn = new mf(MK, "IN_GAME");
   public static m3 m = new m3("net.minecraftforge.client.settings.KeyModifier");
   public static ow Mb = new ow(m, "valueFromString");
   public static mf C6 = new mf(m, "NONE");
   public static m3 ul = new m3("net.minecraft.launchwrapper.Launch");
   public static mf x = new mf(ul, "blackboard");
   public static m3 CD = new m3("net.minecraftforge.client.model.pipeline.LightUtil");
   public static mf k = new mf(CD, "itemConsumer");
   public static ow P = new ow(CD, "putBakedQuad");
   public static ow Ce = new ow(CD, "renderQuadColor");
   public static mf UJ = new mf(CD, "tessellator");
   public static m3 U7 = new m3("net.minecraftforge.common.MinecraftForge");
   public static mf uu = new mf(U7, "EVENT_BUS");
   public static m3 CE = new m3("net.minecraftforge.client.MinecraftForgeClient");
   public static ow ur = new ow(CE, "getRenderPass");
   public static ow BW = new ow(CE, "onRebuildChunk");
   public static m3 Mm = new m3("net.minecraftforge.client.model.ModelLoader");
   public static mf CT = new mf(Mm, "stateModels");
   public static ow M7 = new ow(Mm, "onRegisterItems");
   public static ow MM = new ow(Mm, "getInventoryVariant");
   public static m3 Mu = new m3("net.minecraftforge.client.model.ModelLoader$VanillaLoader", true);
   public static mf Bz = new mf(Mu, "INSTANCE", true);
   public static ow uv = new ow(Mu, "loadModel", (Class[])null, true);
   public static m3 MY = new m3("net.minecraftforge.client.model.ModelLoaderRegistry", true);
   public static mf CV = new mf(MY, "textures", true);
   public static m3 uk = new m3("net.minecraftforge.client.gui.NotificationModUpdateScreen");
   public static ow Cz = new ow(uk, "init");
   public static m3 Me = new m3("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
   public static mf CL = new mf(Me, "BLOCK");
   public static m3 uf = new m3("net.minecraftforge.fml.client.registry.RenderingRegistry");
   public static ow MB = new ow(uf, "loadEntityRenderers", new Class[]{net.y0.d.class, Map.class});
   public static m3 Cf = new m3("net.minecraftforge.client.event.RenderItemInFrameEvent");
   public static w4 MJ = new w4(Cf, new Class[]{net.nm.e.class, net.y0.x.class});
   public static m3 BT = new m3("net.minecraftforge.client.event.RenderLivingEvent$Pre");
   public static w4 y = new w4(BT, new Class[]{a.class, o.class, Float.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
   public static m3 Cn = new m3("net.minecraftforge.client.event.RenderLivingEvent$Post");
   public static w4 Cp = new w4(Cn, new Class[]{a.class, o.class, Float.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
   public static m3 uZ = new m3("net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre");
   public static w4 Bx = new w4(uZ, new Class[]{a.class, o.class, Double.TYPE, Double.TYPE, Double.TYPE});
   public static m3 Cd = new m3("net.minecraftforge.client.event.RenderLivingEvent$Specials$Post");
   public static w4 MU = new w4(Cd, new Class[]{a.class, o.class, Double.TYPE, Double.TYPE, Double.TYPE});
   public static m3 BP = new m3("net.minecraftforge.client.event.ScreenshotEvent");
   public static ow Bo = new ow(BP, "getCancelMessage");
   public static ow M0 = new ow(BP, "getScreenshotFile");
   public static ow Cq = new ow(BP, "getResultMessage");
   public static m3 M6 = new m3("net.minecraftforge.fml.client.SplashProgress");
   public static m3 F = new m3("net.minecraftforge.event.world.WorldEvent$Load");
   public static w4 BJ = new w4(F, new Class[]{r.class});
   public static m3 CP = new m3(net.cp.o.class);
   public static mf C2 = new mf(CP, Long2ObjectMap.class);
   public static m3 Bl = new m3(tt.class);
   public static mf Mt = new mf(Bl, String.class);
   public static m3 z = new m3(k.class);
   public static mf Y = new mf(z, net.c9.x.class);
   public static m3 Bc = new m3(net.nn.j.class);
   public static mf MX = new mf(Bc, net.c9.a.class);
   public static mf CG = new mf(new x8());
   public static m3 M8 = new m3(ec.class);
   public static mf Cs = new mf(M8, jb.class);
   public static m3 MG = new m3(g.class);
   public static b6 UH = new b6(MG, jb.class, 6);
   public static m3 CM = new m3(net.y6.q.class);
   public static mf U2 = new mf(CM, jb.class);
   public static mf MP = new mf(CM, jb[].class);
   public static m3 O = new m3(net.y6.x.class);
   public static b6 uy = new b6(O, jb.class, 12);
   public static m3 BL = new m3(net.y6.k.class);
   public static b6 CW = new b6(BL, jb.class, 3);
   public static m3 ML = new m3(net.y0.k.class);
   public static mf p = new mf(ML, net.y6.z.class, 0);
   public static mf CB = new mf(ML, net.y6.z.class, 1);
   public static m3 uS = new m3(ef.class);
   public static mf u6 = new mf(uS, jb[].class);
   public static m3 Mp = new m3(e7.class);
   public static b6 Bk = new b6(Mp, jb.class, 3);
   public static m3 ME = new m3(eb.class);
   public static mf Bd = new mf(ME, jb.class);
   public static mf un = new mf(ME, jb[].class);
   public static m3 uL = new m3(eo.class);
   public static mf uF = new mf(uL, jb.class, 0);
   public static mf uw = new mf(uL, jb.class, 1);
   public static mf uO = new mf(uL, jb[].class, 0);
   public static mf C7 = new mf(uL, jb[].class, 1);
   public static m3 CU = new m3(net.y6.o.class);
   public static mf ub = new mf(CU, jb.class, 0);
   public static mf um = new mf(CU, jb.class, 1);
   public static m3 B8 = new m3(ek.class);
   public static b6 G = new b6(B8, jb.class, 39);
   public static m3 BC = new m3(b.class);
   public static mf M5 = new mf(BC, ev.class);
   public static m3 up = new m3(ei.class);
   public static mf Bf = new mf(up, jb.class);
   public static mf uq = new mf(up, jb[].class);
   public static m3 f = new m3(et.class);
   public static b6 Mf = new b6(f, jb.class, 8);
   public static m3 BD = new m3(ez.class);
   public static b6 Ma = new b6(BD, jb.class, 12);
   public static m3 A = new m3(eu.class);
   public static mf uj = new mf(A, jb[].class, 0);
   public static mf B_ = new mf(A, jb[].class, 1);
   public static m3 Bv = new m3(eh.class);
   public static b6 BB = new b6(Bv, jb.class, 4);
   public static m3 Ms = new m3(eq.class);
   public static mf uI = new mf(Ms, jb.class);
   public static mf M4 = new mf(Ms, jb[].class);
   public static m3 B7 = new m3(net.y6.b.class);
   public static mf M9 = new mf(B7, jb.class, 0);
   public static mf BR = new mf(B7, jb.class, 1);
   public static m3 Um = new m3(ea.class);
   public static mf UP = new mf(Um, jb.class, 0);
   public static mf Mk = new mf(Um, jb.class, 1);
   public static m3 MS = new m3(e8.class);
   public static mf uX = new mf(MS, jb[].class, 0);
   public static mf uB = new mf(MS, jb[].class, 1);
   public static m3 B = new m3(er.class);
   public static mf Mc = new mf(B, jb.class, 6);
   public static mf BY = new mf(B, jb.class, 7);
   public static m3 Mv = new m3("optifine.OptiFineClassTransformer");
   public static mf uV = new mf(Mv, "instance");
   public static ow Ca = new ow(Mv, "getOptiFineResource");
   public static m3 Cm = new m3(net.y0.g.class);
   public static mf CA = new mf(Cm, net.y6.z.class);
   public static m3 CR = new m3(net.y0.q.class);
   public static mf B5 = new mf(CR, e7.class);
   public static m3 Cv = new m3(cu.class);
   public static mf C4 = new mf(Cv, net.y6.z.class);
   public static m3 b = new m3(ch.class);
   public static mf uT = new mf(b, e9.class);
   public static m3 Bm = new m3(co.class);
   public static mf U = new mf(Bm, el.class);
   public static m3 CN = new m3(t.class);
   public static mf uA = new mf(CN, net.y6.r.class);
   public static m3 B1 = new m3(net.c5.n.class);
   public static mf B4 = new mf(B1, m.class, 0);
   public static mf Mw = new mf(B1, m.class, 1);
   public static m3 BN = new m3(net.c5.j.class);
   public static mf Cy = new mf(BN, net.y6.h.class);
   public static m3 Cl = new m3(u.class);
   public static mf BK = new mf(Cl, m.class);
   public static m3 l = new m3(s.class);
   public static mf MH = new mf(l, e4.class);
   public static m3 MQ = new m3(net.c5.z.class);
   public static mf BS = new mf(MQ, es.class);
   public static m3 u_ = new m3(net.c5.p.class);
   public static mf u7 = new mf(u_, net.y6.o.class, 0);
   public static mf M1 = new mf(u_, el.class, 0);
   public static mf BX = new mf(u_, el.class, 1);

   public static void Q(ow var0, Object... var1) {
      Method var2 = var0.V();
   }

   public static boolean G(ow var0, Object... var1) {
      Method var2 = var0.V();
      return false;
   }

   public static int F(ow var0, Object... var1) {
      Method var2 = var0.V();
      return 0;
   }

   public static float k(ow var0, Object... var1) {
      Method var2 = var0.V();
      return 0.0F;
   }

   public static double o(ow var0, Object... var1) {
      Method var2 = var0.V();
      return 0.0D;
   }

   public static String d(ow var0, Object... var1) {
      Method var2 = var0.V();
      return null;
   }

   public static Object H(ow var0, Object... var1) {
      Method var2 = var0.V();
      return null;
   }

   public static void F(Object var0, ow var1, Object... var2) {
   }

   public static boolean I(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return false;
   }

   public static int B(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return 0;
   }

   public static float H(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return 0.0F;
   }

   public static double z(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return 0.0D;
   }

   public static String q(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return null;
   }

   public static Object b(Object var0, ow var1, Object... var2) {
      Method var3 = var1.V();
      return null;
   }

   public static Object n(mf var0) {
      return G((Object)null, (mf)var0);
   }

   public static Object G(Object var0, mf var1) {
      Field var2 = var1.H();
      return null;
   }

   public static Object w(b6 var0, int var1) {
      mf var2 = var0.M(var1);
      return null;
   }

   public static Object g(Object var0, b6 var1, int var2) {
      mf var3 = var1.M(var2);
      return null;
   }

   public static float I(Object var0, mf var1, float var2) {
      Object var3 = G(var0, var1);
      if(!(var3 instanceof Float)) {
         return var2;
      } else {
         Float var4 = (Float)var3;
         return var4.floatValue();
      }
   }

   public static boolean q(mf var0, Object var1) {
      return t((Object)null, var0, var1);
   }

   public static boolean t(Object var0, mf var1, Object var2) {
      Field var3 = var1.H();
      return false;
   }

   public static boolean C(w4 var0, Object... var1) {
      Object var2 = K(var0, var1);
      return b(var2);
   }

   public static boolean b(Object var0) {
      return false;
   }

   public static Object K(w4 var0, Object... var1) {
      Constructor var2 = var0.p();
      return null;
   }

   public static boolean f(Class[] var0, Class[] var1) {
      if(var0.length != var1.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class var3 = var0[var2];
            Class var4 = var1[var2];
            if(var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private static void l(boolean var0, String var1, ow var2, Object[] var3, Object var4) {
      String var5 = var2.V().getDeclaringClass().getName();
      String var6 = var2.V().getName();
      String var7 = "";
      var7 = " static";
      z9.v(var1 + var7 + " " + var5 + "." + var6 + "(" + z9.O(var3) + ") => " + var4);
   }

   private static void w(boolean var0, String var1, ow var2, Object[] var3) {
      String var4 = var2.V().getDeclaringClass().getName();
      String var5 = var2.V().getName();
      String var6 = "";
      var6 = " static";
      z9.v(var1 + var6 + " " + var4 + "." + var5 + "(" + z9.O(var3) + ")");
   }

   private static void B(boolean var0, String var1, mf var2, Object var3) {
      String var4 = var2.H().getDeclaringClass().getName();
      String var5 = var2.H().getName();
      String var6 = "";
      var6 = " static";
      z9.v(var1 + var6 + " " + var4 + "." + var5 + " => " + var3);
   }

   private static void X(Throwable var0, Object var1, ow var2, Object[] var3) {
      String var4 = mf.O();
      if(var0 instanceof InvocationTargetException) {
         Throwable var5 = var0.getCause();
         if(var5 instanceof RuntimeException) {
            RuntimeException var6 = (RuntimeException)var5;
            throw var6;
         }

         var0.printStackTrace();
      }

      if(var0 instanceof IllegalArgumentException) {
         z9.h("*** IllegalArgumentException ***");
         z9.h("Method: " + var2.V());
         z9.h("Object: " + var1);
         z9.h("Parameter classes: " + z9.O(T(var3)));
         z9.h("Parameters: " + z9.O(var3));
      }

      z9.h("*** Exception outside of method ***");
      z9.h("Method deactivated: " + var2.V());
      var2.L();
      var0.printStackTrace();
   }

   private static void R(Throwable var0, w4 var1, Object[] var2) {
      if(var0 instanceof InvocationTargetException) {
         var0.printStackTrace();
      } else {
         if(var0 instanceof IllegalArgumentException) {
            z9.h("*** IllegalArgumentException ***");
            z9.h("Constructor: " + var1.p());
            z9.h("Parameter classes: " + z9.O(T(var2)));
            z9.h("Parameters: " + z9.O(var2));
         }

         z9.h("*** Exception outside of constructor ***");
         z9.h("Constructor deactivated: " + var1.p());
         var1.d();
         var0.printStackTrace();
      }

   }

   private static Object[] T(Object[] var0) {
      return new Class[0];
   }

   private static mf[] O(m3 var0, Class var1, int var2) {
      mf[] var3 = new mf[var2];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = new mf(var0, var1, var4);
      }

      return var3;
   }

   private static boolean f(String var0) {
      z9.v(var0);
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
