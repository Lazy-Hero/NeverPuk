package net.h;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import io.netty.util.internal.ThreadLocalRandom;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.xn;
import net.h.d;
import net.h.e;
import net.h.l;
import net.h.m;
import net.h.n;
import net.h.u;
import net.u.t;
import net.yz.m_;
import net.yz.p;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class j {
   private static final Marker S = MarkerManager.getMarker("SOUNDS");
   private static final Logger m = LogManager.getLogger();
   private static final Set j = Sets.newHashSet();
   private final m Q;
   private final net.nr.d A;
   private j.u U;
   private boolean H;
   private int T;
   private final Map L = HashBiMap.create();
   private final Map b;
   private final Multimap w;
   private final List R;
   private final Map h;
   private final Map l;
   private final List E;
   private final List Z;

   public j(m var1, net.nr.d var2) {
      this.b = ((BiMap)this.L).inverse();
      this.w = HashMultimap.create();
      this.R = Lists.newArrayList();
      this.h = Maps.newHashMap();
      this.l = Maps.newHashMap();
      this.E = Lists.newArrayList();
      this.Z = Lists.newArrayList();
      this.Q = var1;
      this.A = var2;
      SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
      SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
   }

   public void g() {
      j.clear();

      for(net.yz.a var2 : net.yz.a.h) {
         m_ var3 = var2.J();
         if(this.Q.I(var3) == null) {
            m.warn("Missing sound for event: {}", net.yz.a.h.t(var2));
            j.add(var3);
         }
      }

      this.Q();
      this.D();
   }

   private synchronized void D() {
      if(!this.H) {
         (new Thread(new Runnable() {
            public void run() {
               SoundSystemConfig.setLogger(new SoundSystemLogger() {
                  public void message(String var1, int var2) {
                     if(!var1.isEmpty()) {
                        j.m.info(var1);
                     }

                  }

                  public void importantMessage(String var1, int var2) {
                     if(!var1.isEmpty()) {
                        j.m.warn(var1);
                     }

                  }

                  public void errorMessage(String var1, String var2, int var3) {
                     String[] var4 = l.l();
                     if(!var2.isEmpty()) {
                        j.m.error("Error in class \'{}\'", var1);
                        j.m.error(var2);
                     }

                  }

                  private static xn a(xn var0) {
                     return var0;
                  }
               });
               j var10000 = j.this;
               j var10003 = j.this;
               j.this.getClass();
               var10000.U = var10003.new u();
               j.this.H = true;
               j.this.U.setMasterVolume(j.this.A.b(p.MASTER));
               l.l();
               j.m.info(j.S, "Sound engine started");
               net.u.d.h(new net.u.d[5]);
            }

            private static xn a(xn var0) {
               return var0;
            }
         }, "Sound Library Loader")).start();
      }

   }

   private float N(p var1) {
      return var1 != p.MASTER?this.A.b(var1):1.0F;
   }

   public void w(p var1, float var2) {
      if(this.H) {
         if(var1 == p.MASTER) {
            this.U.setMasterVolume(var2);
         } else {
            for(String var4 : this.w.get(var1)) {
               d var5 = (d)this.L.get(var4);
               float var6 = this.c(var5);
               if(var6 <= 0.0F) {
                  this.J(var5);
               } else {
                  this.U.setVolume(var4, var6);
               }
            }
         }
      }

   }

   public void Q() {
      if(this.H) {
         this.P();
         this.U.cleanup();
         this.H = false;
      }

   }

   public void P() {
      if(this.H) {
         for(String var2 : this.L.keySet()) {
            this.U.stop(var2);
         }

         this.L.clear();
         this.h.clear();
         this.R.clear();
         this.w.clear();
         this.l.clear();
      }

   }

   public void H(u var1) {
      this.E.add(var1);
   }

   public void W(u var1) {
      this.E.remove(var1);
   }

   public void C() {
      ++this.T;

      for(e var2 : this.R) {
         var2.m();
         if(var2.b()) {
            this.J(var2);
         } else {
            String var3 = (String)this.b.get(var2);
            this.U.setVolume(var3, this.c(var2));
            this.U.setPitch(var3, this.W((d)var2));
            this.U.setPosition(var3, var2.g(), var2.K(), var2.e());
         }
      }

      Iterator var8 = this.L.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         String var11 = (String)var9.getKey();
         d var4 = (d)var9.getValue();
         if(!this.U.playing(var11)) {
            int var5 = ((Integer)this.l.get(var11)).intValue();
            if(var5 <= this.T) {
               int var6 = var4.Z();
               if(var4.G()) {
                  this.h.put(var4, Integer.valueOf(this.T + var6));
               }

               var8.remove();
               m.debug(S, "Removed channel {} because it\'s not playing anymore", var11);
               this.U.removeSource(var11);
               this.l.remove(var11);
               this.w.remove(var4.p(), var11);
               if(var4 instanceof e) {
                  this.R.remove(var4);
               }
            }
         }
      }

      Iterator var10 = this.h.entrySet().iterator();

      while(var10.hasNext()) {
         Entry var12 = (Entry)var10.next();
         if(this.T >= ((Integer)var12.getValue()).intValue()) {
            d var13 = (d)var12.getKey();
            if(var13 instanceof e) {
               ((e)var13).m();
            }

            this.p(var13);
            var10.remove();
         }
      }

   }

   public boolean w(d var1) {
      if(!this.H) {
         return false;
      } else {
         String var2 = (String)this.b.get(var1);
         return false;
      }
   }

   public void J(d var1) {
      if(this.H) {
         String var2 = (String)this.b.get(var1);
         this.U.stop(var2);
      }

   }

   public void p(d var1) {
      String[] var2 = l.l();
      if(this.H) {
         n var3 = var1.r(this.Q);
         m_ var4 = var1.o();
         if(j.add(var4)) {
            m.warn(S, "Unable to play unknown soundEvent: {}", var4);
            if(!this.E.isEmpty()) {
               Iterator var5 = this.E.iterator();
               if(var5.hasNext()) {
                  u var6 = (u)var5.next();
                  var6.x(var1, var3);
               }
            }

            if(this.U.getMasterVolume() <= 0.0F) {
               m.debug(S, "Skipped playing soundEvent: {}, master volume was zero", var4);
            }

            net.h.z var14 = var1.N();
            if(var14 == m.R) {
               if(!j.add(var4)) {
                  return;
               }

               m.warn(S, "Unable to play empty soundEvent: {}", var4);
            }

            float var15 = var1.d();
            float var7 = 16.0F;
            if(var15 > 1.0F) {
               var7 *= var15;
            }

            p var8 = var1.p();
            float var9 = this.c(var1);
            float var10 = this.W(var1);
            if(Float.compare(var9, 0.0F) == 0) {
               m.debug(S, "Skipped playing sound {}, volume was zero.", var14.m());
            }

            boolean var11 = var1.G() && var1.Z() == 0;
            String var12 = t.g(ThreadLocalRandom.current()).toString();
            m_ var13 = var14.I();
            if(var14.f()) {
               this.U.newStreamingSource(false, var12, h(var13), var13.toString(), var11, var1.g(), var1.K(), var1.e(), var1.k().D(), var7);
            }

            this.U.newSource(false, var12, h(var13), var13.toString(), var11, var1.g(), var1.K(), var1.e(), var1.k().D(), var7);
            m.debug(S, "Playing sound {} for event {} as channel {}", var14.m(), var4, var12);
            this.U.setPitch(var12, var10);
            this.U.setVolume(var12, var9);
            this.U.play(var12);
            this.l.put(var12, Integer.valueOf(this.T + 20));
            this.L.put(var12, var1);
            this.w.put(var8, var12);
            if(var1 instanceof e) {
               this.R.add((e)var1);
            }
         }
      }

   }

   private float W(d var1) {
      return t.T(var1.n(), 0.5F, 2.0F);
   }

   private float c(d var1) {
      return t.T(var1.d() * this.N(var1.p()), 0.0F, 1.0F);
   }

   public void r() {
      for(Entry var2 : this.L.entrySet()) {
         String var3 = (String)var2.getKey();
         boolean var4 = this.w((d)var2.getValue());
         m.debug(S, "Pausing channel {}", var3);
         this.U.pause(var3);
         this.Z.add(var3);
      }

   }

   public void E() {
      for(String var2 : this.Z) {
         m.debug(S, "Resuming channel {}", var2);
         this.U.play(var2);
      }

      this.Z.clear();
   }

   public void T(d var1, int var2) {
      this.h.put(var1, Integer.valueOf(this.T + var2));
   }

   private static URL h(final m_ var0) {
      String var1 = String.format("%s:%s:%s", new Object[]{"mcsounddomain", var0.A(), var0.v()});
      URLStreamHandler var2 = new URLStreamHandler() {
         protected URLConnection openConnection(final URL var1) {
            return new URLConnection(var1) {
               public void connect() throws IOException {
               }

               public InputStream getInputStream() throws IOException {
                  return net.nn.j.b().C().A(var0).k();
               }
            };
         }
      };
      return new URL((URL)null, var1, var2);
   }

   public void U(net.r.r var1, float var2) {
      if(this.H) {
         float var3 = var1.d + (var1.V - var1.d) * var2;
         float var4 = var1.hq + (var1.hN - var1.hq) * var2;
         double var5 = var1.h + (var1.b - var1.h) * (double)var2;
         double var7 = var1.h6 + (var1.hS - var1.h6) * (double)var2 + (double)var1.A();
         double var9 = var1.l + (var1.hr - var1.l) * (double)var2;
         float var11 = t.m((var4 + 90.0F) * 0.017453292F);
         float var12 = t.A((var4 + 90.0F) * 0.017453292F);
         float var13 = t.m(-var3 * 0.017453292F);
         float var14 = t.A(-var3 * 0.017453292F);
         float var15 = t.m((-var3 + 90.0F) * 0.017453292F);
         float var16 = t.A((-var3 + 90.0F) * 0.017453292F);
         float var17 = var11 * var13;
         float var18 = var12 * var13;
         float var19 = var11 * var15;
         float var20 = var12 * var15;
         this.U.setListenerPosition((float)var5, (float)var7, (float)var9);
         this.U.setListenerOrientation(var17, var14, var18, var19, var16, var20);
      }

   }

   public void q(String var1, p var2) {
      for(String var4 : this.w.get(var2)) {
         d var5 = (d)this.L.get(var4);
         if(var1.isEmpty()) {
            this.J(var5);
         } else if(var5.o().equals(new m_(var1))) {
            this.J(var5);
         }
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   class u extends SoundSystem {
      private u() {
      }

      public boolean playing(String var1) {
         l.l();
         Object var3 = SoundSystemConfig.THREAD_SYNC;
         if(this.soundLibrary == null) {
            return false;
         } else {
            Source var4 = (Source)this.soundLibrary.getSources().get(var1);
            return var4 == null?false:var4.playing() || var4.paused() || var4.preLoad;
         }
      }
   }
}
