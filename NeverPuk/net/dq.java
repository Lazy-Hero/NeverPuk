package net;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.b2;
import net.bp;
import net.dn;
import net.p7;
import net.pg;
import net.xc;
import net.zk;
import net.cb.t;
import net.n2.k;
import net.no.x;
import net.nx.f;
import net.r.h;
import net.yz.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dq {
   private static final Logger B = LogManager.getLogger();
   private static final Gson M = (new GsonBuilder()).registerTypeAdapter(pg.class, new pg.t()).registerTypeAdapter(net.yz.m_.class, new net.yz.m_()).setPrettyPrinting().create();
   private static final TypeToken W = new TypeToken() {
   };
   private final f Z;
   private final File d;
   private final Map R = Maps.newLinkedHashMap();
   private final Set H = Sets.newLinkedHashSet();
   private final Set K = Sets.newLinkedHashSet();
   private final Set V = Sets.newLinkedHashSet();
   private h N;
   @Nullable
   private xc I;
   private boolean l = true;

   public dq(f var1, File var2, h var3) {
      this.Z = var1;
      this.d = var2;
      this.N = var3;
      this.W();
   }

   public void m(h var1) {
      this.N = var1;
   }

   public void c() {
      for(zk var2 : b2.z()) {
         var2.k(this);
      }

   }

   public void U() {
      this.c();
      this.R.clear();
      this.H.clear();
      this.K.clear();
      this.V.clear();
      this.l = true;
      this.I = null;
      this.W();
   }

   private void z() {
      for(xc var2 : this.Z.M().o()) {
         this.L(var2);
      }

   }

   private void Y() {
      ArrayList var1 = Lists.newArrayList();

      for(Entry var3 : this.R.entrySet()) {
         if(((pg)var3.getValue()).l()) {
            var1.add(var3.getKey());
            this.V.add(var3.getKey());
         }
      }

      for(xc var5 : var1) {
         this.P(var5);
      }

   }

   private void v() {
      for(xc var2 : this.Z.M().o()) {
         if(var2.G().isEmpty()) {
            this.Y(var2, "");
            var2.t().W(this.N);
         }
      }

   }

   private void W() {
      boolean var1 = zk.l.D();
      if(this.d.isFile()) {
         String var2 = Files.toString(this.d, StandardCharsets.UTF_8);
         Map var3 = (Map)c.n(M, var2, W.getType());
         if(var3 == null) {
            throw new JsonParseException("Found null for advancements");
         }

         Stream var4 = var3.entrySet().stream().sorted(Comparator.comparing(Entry::getValue));
         Iterator var5 = ((List)var4.collect(Collectors.toList())).iterator();
         if(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            xc var7 = this.Z.M().s((net.yz.m_)var6.getKey());
            B.warn("Ignored advancement \'" + var6.getKey() + "\' in progress file " + this.d + " - it doesn\'t exist anymore?");
            this.o(var7, (pg)var6.getValue());
         }
      }

      this.v();
      this.Y();
      this.z();
   }

   public void L() {
      HashMap var1 = Maps.newHashMap();

      for(Entry var3 : this.R.entrySet()) {
         pg var4 = (pg)var3.getValue();
         if(var4.M()) {
            var1.put(((xc)var3.getKey()).S(), var4);
         }
      }

      if(this.d.getParentFile() != null) {
         this.d.getParentFile().mkdirs();
      }

      Files.write(M.toJson(var1), this.d, StandardCharsets.UTF_8);
   }

   public boolean Y(xc var1, String var2) {
      boolean var3 = false;
      pg var4 = this.k(var1);
      boolean var5 = var4.l();
      if(var4.a(var2)) {
         this.N(var1);
         this.V.add(var1);
         var3 = true;
         if(var4.l()) {
            var1.t().W(this.N);
            if(var1.y() != null && var1.y().g() && this.N.hl.N().b("announceAdvancements")) {
               this.Z.c().b((t)(new net.cb.h("chat.type.advancement." + var1.y().m().O(), new Object[]{this.N.b(), var1.y()})));
            }
         }
      }

      if(var4.l()) {
         this.P(var1);
      }

      return var3;
   }

   public boolean P(xc var1, String var2) {
      boolean var3 = false;
      pg var4 = this.k(var1);
      if(var4.m(var2)) {
         this.L(var1);
         this.V.add(var1);
         var3 = true;
      }

      if(!var4.M()) {
         this.P(var1);
      }

      return var3;
   }

   private void L(xc var1) {
      pg var2 = this.k(var1);
      if(!var2.l()) {
         for(Entry var4 : var1.G().entrySet()) {
            dn var5 = var2.M((String)var4.getKey());
            if(!var5.F()) {
               bp var6 = ((p7)var4.getValue()).Q();
               zk var7 = b2.Z(var6.G());
               var7.I(this, new zk.l(var6, var1, (String)var4.getKey()));
            }
         }
      }

   }

   private void N(xc var1) {
      pg var2 = this.k(var1);

      for(Entry var4 : var1.G().entrySet()) {
         dn var5 = var2.M((String)var4.getKey());
         if(var5.F() || var2.l()) {
            bp var6 = ((p7)var4.getValue()).Q();
            zk var7 = b2.Z(var6.G());
            var7.Z(this, new zk.l(var6, var1, (String)var4.getKey()));
         }
      }

   }

   public void N(h var1) {
      if(!this.K.isEmpty() || !this.V.isEmpty()) {
         HashMap var2 = Maps.newHashMap();
         LinkedHashSet var3 = Sets.newLinkedHashSet();
         LinkedHashSet var4 = Sets.newLinkedHashSet();

         for(xc var6 : this.V) {
            if(this.H.contains(var6)) {
               var2.put(var6.S(), this.R.get(var6));
            }
         }

         for(xc var8 : this.K) {
            if(this.H.contains(var8)) {
               var3.add(var8);
            } else {
               var4.add(var8.S());
            }
         }

         if(!var2.isEmpty() || !var3.isEmpty() || !var4.isEmpty()) {
            var1.t1.h((k)(new x(this.l, var3, var4, var2)));
            this.K.clear();
            this.V.clear();
         }
      }

      this.l = false;
   }

   public void K(@Nullable xc var1) {
      xc var2 = this.I;
      if(var1.P() == null && var1.y() != null) {
         this.I = var1;
      } else {
         this.I = null;
      }

      if(var2 != this.I) {
         this.N.t1.h((k)(new net.no.s2(this.I == null?null:this.I.S())));
      }

   }

   public pg k(xc var1) {
      pg var2 = (pg)this.R.get(var1);
      var2 = new pg();
      this.o(var1, var2);
      return var2;
   }

   private void o(xc var1, pg var2) {
      var2.T(var1.G(), var1.A());
      this.R.put(var1, var2);
   }

   private void P(xc var1) {
      boolean var2 = this.L(var1);
      boolean var3 = this.H.contains(var1);
      this.H.add(var1);
      this.K.add(var1);
      if(this.R.containsKey(var1)) {
         this.V.add(var1);
      }

      if(var2 != var3 && var1.P() != null) {
         this.P(var1.P());
      }

      for(xc var5 : var1.W()) {
         this.P(var5);
      }

   }

   private boolean L(xc var1) {
      for(int var2 = 0; !this.p(var1); ++var2) {
         if(var1.y() == null) {
            return false;
         }

         pg var3 = this.k(var1);
         if(var3.l()) {
            return true;
         }

         if(var1.y().s()) {
            return false;
         }

         var1 = var1.P();
      }

      return true;
   }

   private boolean p(xc var1) {
      pg var2 = this.k(var1);
      if(var2.l()) {
         return true;
      } else {
         for(xc var4 : var1.W()) {
            if(this.p(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
