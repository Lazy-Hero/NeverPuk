package net;

import com.sun.jna.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.xn;
import net.ne.l;

public class pm extends s {
   private static final List f = Collections.unmodifiableList(Arrays.asList(new String[]{"state", "details", "startTimestamp", "endTimestamp", "largeImageKey", "largeImageText", "smallImageKey", "smallImageText", "partyId", "partySize", "partyMax", "matchSecret", "joinSecret", "spectateSecret", "instance"}));
   public String t;
   public String q;
   public long H;
   public long K;
   public String z;
   public String I;
   public String A;
   public String w;
   public String F;
   public int h;
   public int a;
   public String W;
   public String G;
   public String C;
   public byte X;

   public pm(String var1) {
      this.a(var1);
   }

   public pm() {
      this("UTF-8");
   }

   public boolean equals(Object var1) {
      boolean var2 = l.d();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof pm)) {
         return false;
      } else {
         pm var3 = (pm)var1;
         return Long.compare(this.H, var3.H) == 0 && this.K == var3.K && this.h == var3.h && this.a == var3.a && this.X == var3.X && Objects.equals(this.t, var3.t) && Objects.equals(this.q, var3.q) && Objects.equals(this.z, var3.z) && Objects.equals(this.I, var3.I) && Objects.equals(this.A, var3.A) && Objects.equals(this.w, var3.w) && Objects.equals(this.F, var3.F) && Objects.equals(this.W, var3.W) && Objects.equals(this.G, var3.G) && Objects.equals(this.C, var3.C);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.t, this.q, Long.valueOf(this.H), Long.valueOf(this.K), this.z, this.I, this.A, this.w, this.F, Integer.valueOf(this.h), Integer.valueOf(this.a), this.W, this.G, this.C, Byte.valueOf(this.X)});
   }

   protected List R() {
      return f;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
