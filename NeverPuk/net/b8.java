package net;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.uv;
import net.xn;

public class b8 {
   private String d = null;
   private final Map f = new HashMap();
   private final Set H = new HashSet();

   public b8(String var1) {
      this.d = var1;
   }

   public String t() {
      return this.d;
   }

   public void M(String var1, String var2) {
      this.f.put(var1, var2);
   }

   public void O(b8 var1) {
      int[] var2 = uv.l();
      if(var1 != null) {
         this.f.putAll(var1.f);
      }

   }

   public void N(uv[] var1) {
      uv.l();
      int var3 = 0;
      if(var3 < var1.length) {
         uv var4 = var1[var3];
         String var5 = var4.T();
         String var6 = (String)this.f.get(var5);
         var4.D(var6);
         ++var3;
      }

   }

   public String[] g() {
      Set var1 = this.f.keySet();
      String[] var2 = (String[])var1.toArray(new String[var1.size()]);
      return var2;
   }

   public String S(String var1) {
      return (String)this.f.get(var1);
   }

   public void l(String var1) {
      this.H.add(var1);
   }

   public Collection P() {
      return new HashSet(this.H);
   }

   public void R(Collection var1) {
      this.H.addAll(var1);
   }

   public boolean g(String var1) {
      return this.H.contains(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
