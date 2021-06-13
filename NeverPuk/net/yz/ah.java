package net.yz;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.yz.m_;

public class ah implements Map {
   private final Map w = Maps.newLinkedHashMap();

   public int size() {
      return this.w.size();
   }

   public boolean isEmpty() {
      return this.w.isEmpty();
   }

   public boolean containsKey(Object var1) {
      return this.w.containsKey(var1.toString().toLowerCase(Locale.ROOT));
   }

   public boolean containsValue(Object var1) {
      return this.w.containsKey(var1);
   }

   public Object get(Object var1) {
      return this.w.get(var1.toString().toLowerCase(Locale.ROOT));
   }

   public Object I(String var1, Object var2) {
      return this.w.put(var1.toLowerCase(Locale.ROOT), var2);
   }

   public Object remove(Object var1) {
      return this.w.remove(var1.toString().toLowerCase(Locale.ROOT));
   }

   public void putAll(Map var1) {
      m_.g();
      Iterator var3 = var1.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.I((String)var4.getKey(), var4.getValue());
      }

   }

   public void clear() {
      this.w.clear();
   }

   public Set keySet() {
      return this.w.keySet();
   }

   public Collection values() {
      return this.w.values();
   }

   public Set entrySet() {
      return this.w.entrySet();
   }
}
