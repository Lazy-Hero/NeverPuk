package net.no;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.pg;
import net.xc;
import net.no.s8;
import net.yz.m_;

public class x implements net.n2.k {
   private boolean f;
   private Map Y;
   private Set H;
   private Map p;

   public x() {
   }

   public x(boolean var1, Collection var2, Set var3, Map var4) {
      this.f = var1;
      this.Y = Maps.newHashMap();

      for(xc var6 : var2) {
         this.Y.put(var6.S(), var6.R());
      }

      this.H = var3;
      this.p = Maps.newHashMap(var4);
   }

   public void S(net.x.t var1) {
      var1.G(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.f = var1.readBoolean();
      this.Y = Maps.newHashMap();
      this.H = Sets.newLinkedHashSet();
      this.p = Maps.newHashMap();
      int var2 = var1.q();

      for(int var3 = 0; var3 < var2; ++var3) {
         m_ var4 = var1.z();
         xc.z var5 = xc.z.e(var1);
         this.Y.put(var4, var5);
      }

      var2 = var1.q();

      for(int var8 = 0; var8 < var2; ++var8) {
         m_ var10 = var1.z();
         this.H.add(var10);
      }

      var2 = var1.q();

      for(int var9 = 0; var9 < var2; ++var9) {
         m_ var11 = var1.z();
         this.p.put(var11, pg.l(var1));
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeBoolean(this.f);
      var1.a(this.Y.size());
      s8.Y();
      Iterator var3 = this.Y.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         m_ var5 = (m_)var4.getKey();
         xc.z var6 = (xc.z)var4.getValue();
         var1.Q(var5);
         var6.Y(var1);
      }

      var1.a(this.H.size());
      var3 = this.H.iterator();
      if(var3.hasNext()) {
         m_ var9 = (m_)var3.next();
         var1.Q(var9);
      }

      var1.a(this.p.size());
      var3 = this.p.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var10 = (Entry)var3.next();
         var1.Q((m_)var10.getKey());
         ((pg)var10.getValue()).H(var1);
      }

   }

   public Map d() {
      return this.Y;
   }

   public Set M() {
      return this.H;
   }

   public Map k() {
      return this.p;
   }

   public boolean H() {
      return this.f;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
