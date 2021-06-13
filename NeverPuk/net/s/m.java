package net.s;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.s.b;
import net.s.i;
import net.s.k;
import net.u.d;
import net.yz.ah;

public abstract class m {
   protected final Map c = Maps.newHashMap();
   protected final Map K = new ah();
   protected final Multimap o = HashMultimap.create();

   public i Q(b var1) {
      return (i)this.c.get(var1);
   }

   @Nullable
   public i a(String var1) {
      return (i)this.K.get(var1);
   }

   public i i(b var1) {
      int var2 = k.z();
      if(this.K.containsKey(var1.K())) {
         throw new IllegalArgumentException("Attribute is already registered!");
      } else {
         i var3 = this.G(var1);
         this.K.put(var1.K(), var3);
         this.c.put(var1, var3);
         b var4 = var1.B();
         this.o.put(var4, var1);
         var4 = var4.B();
         d.h(new d[4]);
         return var3;
      }
   }

   protected abstract i G(b var1);

   public Collection k() {
      return this.K.values();
   }

   public void W(i var1) {
   }

   public void e(Multimap var1) {
      for(Entry var3 : var1.entries()) {
         i var4 = this.a((String)var3.getKey());
         var4.n((k)var3.getValue());
      }

   }

   public void q(Multimap var1) {
      k.z();
      Iterator var3 = var1.entries().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         i var5 = this.a((String)var4.getKey());
         if(var5 != null) {
            var5.n((k)var4.getValue());
            var5.g((k)var4.getValue());
         }
      }

   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
