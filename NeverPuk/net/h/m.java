package net.h;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.c9.p;
import net.cb.t;
import net.h.c;
import net.h.d;
import net.h.g;
import net.h.h;
import net.h.i;
import net.h.j;
import net.h.l;
import net.h.n;
import net.h.u;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m implements net.c9.v, net.yz.i {
   public static final net.h.z R = new net.h.z("meta:missing_sound", 1.0F, 1.0F, 1, net.h.z.FILE, false);
   private static final Logger U = LogManager.getLogger();
   private static final Gson C = (new GsonBuilder()).registerTypeHierarchyAdapter(t.class, new t.w()).registerTypeAdapter(g.class, new c()).create();
   private static final ParameterizedType r = new ParameterizedType() {
      public Type[] getActualTypeArguments() {
         return new Type[]{String.class, g.class};
      }

      public Type getRawType() {
         return Map.class;
      }

      public Type getOwnerType() {
         return null;
      }
   };
   private final i P = new i();
   private final j M;
   private final p t;

   public m(p var1, net.nr.d var2) {
      this.t = var1;
      this.M = new j(this, var2);
   }

   public void s(p var1) {
      l.l();
      this.P.v();
      Iterator var3 = var1.o().iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         Iterator var5 = var1.R(new m_(var4, "sounds.json")).iterator();
         if(var5.hasNext()) {
            net.c9.q var6 = (net.c9.q)var5.next();
            Map var7 = this.g(var6.k());
            Iterator var8 = var7.entrySet().iterator();
            if(var8.hasNext()) {
               Entry var9 = (Entry)var8.next();
               this.b(new m_(var4, (String)var9.getKey()), (g)var9.getValue());
            }
         }
      }

      var3 = this.P.i().iterator();
      if(var3.hasNext()) {
         m_ var12 = (m_)var3.next();
         n var14 = (n)this.P.B(var12);
         if(var14.d() instanceof net.cb.h) {
            String var15 = ((net.cb.h)var14.d()).X();
            if(!net.c9.b.q(var15)) {
               U.debug("Missing subtitle {} for event: {}", var15, var12);
            }
         }
      }

      var3 = this.P.i().iterator();
      if(var3.hasNext()) {
         m_ var13 = (m_)var3.next();
         if(net.yz.a.h.B(var13) == null) {
            U.debug("Not having sound event for: {}", var13);
         }
      }

      this.M.g();
   }

   @Nullable
   protected Map g(InputStream var1) {
      Map var2 = (Map)net.yz.c.e(C, new InputStreamReader(var1, StandardCharsets.UTF_8), r);
      IOUtils.closeQuietly(var1);
      return var2;
   }

   private void b(m_ var1, g var2) {
      n var3 = (n)this.P.B(var1);
      boolean var4 = true;
      if(var2.V()) {
         U.debug("Replaced sound event location {}", var1);
         var3 = new n(var1, var2.z());
         this.P.Q(var3);
      }

      for(final net.h.z var6 : var2.X()) {
         final m_ var7 = var6.m();
         Object var8;
         switch(null.J[var6.E().ordinal()]) {
         case 1:
            if(!this.R(var6, var1)) {
               continue;
            }

            var8 = var6;
            break;
         case 2:
            var8 = new h() {
               public int p() {
                  l.l();
                  n var2 = (n)m.this.P.B(var7);
                  return var2 == null?0:var2.p();
               }

               public net.h.z T() {
                  l.l();
                  n var2 = (n)m.this.P.B(var7);
                  if(var2 == null) {
                     return m.R;
                  } else {
                     net.h.z var3 = var2.C();
                     return new net.h.z(var3.m().toString(), var3.G() * var6.G(), var3.J() * var6.J(), var6.p(), net.h.z.FILE, var3.f() || var6.f());
                  }
               }

               private static xn a(xn var0) {
                  return var0;
               }
            };
            break;
         default:
            throw new IllegalStateException("Unknown SoundEventRegistration type: " + var6.E());
         }

         var3.Z((h)var8);
      }

   }

   private boolean R(net.h.z var1, m_ var2) {
      m_ var3 = var1.I();
      net.c9.q var4 = null;
      var4 = this.t.A(var3);
      var4.k();
      boolean var6 = true;
      IOUtils.closeQuietly(var4);
      return var6;
   }

   @Nullable
   public n I(m_ var1) {
      return (n)this.P.B(var1);
   }

   public void g(d var1) {
      this.M.p(var1);
   }

   public void C(d var1, int var2) {
      this.M.T(var1, var2);
   }

   public void C(net.r.r var1, float var2) {
      this.M.U(var1, var2);
   }

   public void B() {
      this.M.r();
   }

   public void T() {
      this.M.P();
   }

   public void c() {
      this.M.Q();
   }

   public void m() {
      this.M.C();
   }

   public void l() {
      this.M.E();
   }

   public void k(net.yz.p var1, float var2) {
      if(var1 == net.yz.p.MASTER && var2 <= 0.0F) {
         this.T();
      }

      this.M.w(var1, var2);
   }

   public void E(d var1) {
      this.M.J(var1);
   }

   public boolean J(d var1) {
      return this.M.w(var1);
   }

   public void P(u var1) {
      this.M.H(var1);
   }

   public void N(u var1) {
      this.M.W(var1);
   }

   public void x(String var1, net.yz.p var2) {
      this.M.q(var1, var2);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
