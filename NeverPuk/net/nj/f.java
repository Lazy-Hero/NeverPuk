package net.nj;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.d.w;
import net.nj.a;
import net.nj.h;
import net.nj.j;
import net.nj.k;
import net.nj.n;
import net.nj.o;
import net.nj.q;
import net.nj.r;
import net.nj.t;
import net.nj.u;
import net.nj.v;
import net.nj.y;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f extends q {
   private static final Logger D = LogManager.getLogger();
   private static final Pattern f = Pattern.compile("[A-Za-z0-9._+-]+");
   private final Map R = Maps.newHashMap();
   private static boolean E;

   void J(DataOutput var1) throws IOException {
      for(String var3 : this.R.keySet()) {
         q var4 = (q)this.R.get(var3);
         H(var3, var4, var1);
      }

      var1.writeByte(0);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(384L);
      if(var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         this.R.clear();

         byte var4;
         while((var4 = l(var1, var3)) != 0) {
            String var5 = x(var1, var3);
            var3.r((long)(224 + 16 * var5.length()));
            q var6 = J(var4, var5, var1, var2 + 1, var3);
            if(this.R.put(var5, var6) != null) {
               var3.r(288L);
            }
         }

      }
   }

   public Set b() {
      return this.R.keySet();
   }

   public byte C() {
      return (byte)10;
   }

   public int y() {
      return this.R.size();
   }

   public void K(String var1, q var2) {
      this.R.put(var1, var2);
   }

   public void D(String var1, byte var2) {
      this.R.put(var1, new a(var2));
   }

   public void h(String var1, short var2) {
      this.R.put(var1, new r(var2));
   }

   public void r(String var1, int var2) {
      this.R.put(var1, new u(var2));
   }

   public void V(String var1, long var2) {
      this.R.put(var1, new k(var2));
   }

   public void h(String var1, UUID var2) {
      this.V(var1 + "Most", var2.getMostSignificantBits());
      this.V(var1 + "Least", var2.getLeastSignificantBits());
   }

   @Nullable
   public UUID R(String var1) {
      return new UUID(this.P(var1 + "Most"), this.P(var1 + "Least"));
   }

   public boolean H(String var1) {
      return this.K(var1 + "Most", 99) && this.K(var1 + "Least", 99);
   }

   public void d(String var1, float var2) {
      this.R.put(var1, new j(var2));
   }

   public void a(String var1, double var2) {
      this.R.put(var1, new v(var2));
   }

   public void b(String var1, String var2) {
      this.R.put(var1, new y(var2));
   }

   public void S(String var1, byte[] var2) {
      this.R.put(var1, new t(var2));
   }

   public void H(String var1, int[] var2) {
      this.R.put(var1, new n(var2));
   }

   public void c(String var1, boolean var2) {
      this.D(var1, (byte)1);
   }

   public q m(String var1) {
      return (q)this.R.get(var1);
   }

   public byte r(String var1) {
      q var2 = (q)this.R.get(var1);
      return (byte)0;
   }

   public boolean G(String var1) {
      return this.R.containsKey(var1);
   }

   public boolean K(String var1, int var2) {
      byte var3 = this.r(var1);
      return var3 == var2?true:(var2 != 99?false:var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4 || var3 == 5 || var3 == 6);
   }

   public byte R(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).k():0;
   }

   public short E(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).z():0;
   }

   public int P(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).Q():0;
   }

   public long P(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).q():0L;
   }

   public float S(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).d():0.0F;
   }

   public double g(String var1) {
      return this.K(var1, 99)?((net.nj.z)this.R.get(var1)).G():0.0D;
   }

   public String J(String var1) {
      return this.K(var1, 8)?((q)this.R.get(var1)).i():"";
   }

   public byte[] q(String var1) {
      return this.K(var1, 7)?((t)this.R.get(var1)).u():new byte[0];
   }

   public int[] g(String var1) {
      return this.K(var1, 11)?((n)this.R.get(var1)).i():new int[0];
   }

   public f o(String var1) {
      return this.K(var1, 10)?(f)this.R.get(var1):new f();
   }

   public h A(String var1, int var2) {
      if(this.r(var1) == 9) {
         h var3 = (h)this.R.get(var1);
         return !var3.N() && var3.F() != var2?new h():var3;
      } else {
         return new h();
      }
   }

   public boolean i(String var1) {
      return this.R(var1) != 0;
   }

   public void A(String var1) {
      this.R.remove(var1);
   }

   public String toString() {
      q.H();
      StringBuilder var2 = new StringBuilder("{");
      Object var3 = this.R.keySet();
      if(D.isDebugEnabled()) {
         ArrayList var4 = Lists.newArrayList(this.R.keySet());
         Collections.sort(var4);
         var3 = var4;
      }

      Iterator var6 = ((Collection)var3).iterator();
      if(var6.hasNext()) {
         String var5 = (String)var6.next();
         if(var2.length() != 1) {
            var2.append(',');
         }

         var2.append(R(var5)).append(':').append(this.R.get(var5));
      }

      return var2.append('}').toString();
   }

   public boolean N() {
      return this.R.isEmpty();
   }

   private w x(final String var1, final int var2, ClassCastException var3) {
      w var4 = w.m(var3, "Reading NBT data");
      net.d.l var5 = var4.s("Corrupt NBT tag", 1);
      var5.L("Tag type found", new net.d.t() {
         public String c() throws Exception {
            return q.z[((q)f.this.R.get(var1)).C()];
         }
      });
      var5.L("Tag type expected", new net.d.t() {
         public String I() throws Exception {
            return q.z[var2];
         }
      });
      var5.e("Tag name", var1);
      return var4;
   }

   public f F() {
      f var1 = new f();

      for(String var3 : this.R.keySet()) {
         var1.K(var3, ((q)this.R.get(var3)).v());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      return super.equals(var1) && Objects.equals(this.R.entrySet(), ((f)var1).R.entrySet());
   }

   public int hashCode() {
      return super.hashCode() ^ this.R.hashCode();
   }

   private static void H(String var0, q var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.C());
      if(var1.C() != 0) {
         var2.writeUTF(var0);
         var1.J(var2);
      }

   }

   private static byte l(DataInput var0, o var1) throws IOException {
      return var0.readByte();
   }

   private static String x(DataInput var0, o var1) throws IOException {
      return var0.readUTF();
   }

   static q J(byte var0, String var1, DataInput var2, int var3, o var4) throws IOException {
      q var5 = q.j(var0);
      var5.n(var2, var3, var4);
      return var5;
   }

   public void I(f var1) {
      for(String var3 : var1.R.keySet()) {
         q var4 = (q)var1.R.get(var3);
         if(var4.C() == 10) {
            if(this.K(var3, 10)) {
               f var5 = this.o(var3);
               var5.I((f)var4);
            } else {
               this.K(var3, var4.v());
            }
         } else {
            this.K(var3, var4.v());
         }
      }

   }

   protected static String R(String var0) {
      return f.matcher(var0).matches()?var0:y.j(var0);
   }

   static {
      r(true);
   }

   public static void r(boolean var0) {
      E = var0;
   }

   public static boolean M() {
      return E;
   }

   public static boolean q() {
      boolean var0 = M();
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
