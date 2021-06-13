package net.no;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.no.s8;

public class si implements net.n2.k {
   private Map J;

   public si() {
   }

   public si(Map var1) {
      this.J = var1;
   }

   public void N(net.x.t var1) {
      var1.E(this);
   }

   public void E(net.n2.h var1) throws IOException {
      s8.x();
      int var3 = var1.q();
      this.J = Maps.newHashMap();
      int var4 = 0;
      if(var4 < var3) {
         net.v.n var5 = net.v.q.O(var1.Z(32767));
         int var6 = var1.q();
         this.J.put(var5, Integer.valueOf(var6));
         ++var4;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.x();
      var1.a(this.J.size());
      Iterator var3 = this.J.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var1.R(((net.v.n)var4.getKey()).r);
         var1.a(((Integer)var4.getValue()).intValue());
      }

   }

   public Map D() {
      return this.J;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
