package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.a;
import net.nj.b;
import net.nj.d;
import net.nj.f;
import net.nj.h;
import net.nj.j;
import net.nj.k;
import net.nj.n;
import net.nj.o;
import net.nj.r;
import net.nj.t;
import net.nj.u;
import net.nj.v;
import net.nj.y;

public abstract class q {
   public static final String[] z = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]", "LONG[]"};
   private static int B;

   abstract void J(DataOutput var1) throws IOException;

   abstract void n(DataInput var1, int var2, o var3) throws IOException;

   public abstract String toString();

   public abstract byte C();

   protected static q j(byte var0) {
      switch(var0) {
      case 0:
         return new b();
      case 1:
         return new a();
      case 2:
         return new r();
      case 3:
         return new u();
      case 4:
         return new k();
      case 5:
         return new j();
      case 6:
         return new v();
      case 7:
         return new t();
      case 8:
         return new y();
      case 9:
         return new h();
      case 10:
         return new f();
      case 11:
         return new n();
      case 12:
         return new d();
      default:
         return null;
      }
   }

   public static String d(int var0) {
      switch(var0) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      case 11:
         return "TAG_Int_Array";
      case 12:
         return "TAG_Long_Array";
      case 99:
         return "Any Numeric Tag";
      default:
         return "UNKNOWN";
      }
   }

   public abstract q v();

   public boolean N() {
      return false;
   }

   public boolean equals(Object var1) {
      return var1 instanceof q && this.C() == ((q)var1).C();
   }

   public int hashCode() {
      return this.C();
   }

   protected String i() {
      return this.toString();
   }

   static {
      B(108);
      String[] var10000 = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]", "LONG[]"};
   }

   public static void B(int var0) {
      B = var0;
   }

   public static int V() {
      return B;
   }

   public static int H() {
      int var0 = V();
      return 38;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
