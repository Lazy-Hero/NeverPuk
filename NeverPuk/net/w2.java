package net;

import java.util.LinkedHashMap;
import java.util.Map;

public class w2 {
   private int r = 0;
   private String m = null;
   private Map J = new LinkedHashMap();
   private byte[] a = null;

   public w2(int var1, String var2, Map var3, byte[] var4) {
      this.r = var1;
      this.m = var2;
      this.J = var3;
      this.a = var4;
   }

   public int q() {
      return this.r;
   }

   public String I() {
      return this.m;
   }

   public Map w() {
      return this.J;
   }

   public String z(String var1) {
      return (String)this.J.get(var1);
   }

   public byte[] g() {
      return this.a;
   }
}
