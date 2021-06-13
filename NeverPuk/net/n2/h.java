package net.n2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import net.n0.ks;
import net.nj.f;
import net.u.j;
import net.yz.m_;

public class h extends ByteBuf {
   private final ByteBuf K;
   private static int q;

   public h(ByteBuf var1) {
      this.K = var1;
   }

   public static int c(int var0) {
      int var1;
      for(var1 = 1; (var0 & -1 << var1 * 7) != 0; ++var1) {
         ;
      }

      return var1;
   }

   public h Z(byte[] var1) {
      this.a(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public byte[] J() {
      return this.z(this.readableBytes());
   }

   public byte[] z(int var1) {
      int var2 = this.q();
      if(var2 > var1) {
         throw new DecoderException("ByteArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         byte[] var3 = new byte[var2];
         this.readBytes(var3);
         return var3;
      }
   }

   public h b(int[] var1) {
      this.a(var1.length);

      for(int var5 : var1) {
         this.a(var5);
      }

      return this;
   }

   public int[] o() {
      return this.F(this.readableBytes());
   }

   public int[] F(int var1) {
      int var2 = this.q();
      if(var2 > var1) {
         throw new DecoderException("VarIntArray with size " + var2 + " is bigger than allowed " + var1);
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = this.q();
         }

         return var3;
      }
   }

   public h M(long[] var1) {
      this.a(var1.length);

      for(long var5 : var1) {
         this.writeLong(var5);
      }

      return this;
   }

   public long[] V(@Nullable long[] var1) {
      return this.a(var1, this.readableBytes() / 8);
   }

   public long[] a(@Nullable long[] var1, int var2) {
      X();
      int var4 = this.q();
      if(var1 == null || var1.length != var4) {
         if(var4 > var2) {
            throw new DecoderException("LongArray with size " + var4 + " is bigger than allowed " + var2);
         }

         var1 = new long[var4];
      }

      int var5 = 0;
      if(var5 < var1.length) {
         var1[var5] = this.readLong();
         ++var5;
      }

      return var1;
   }

   public j S() {
      return j.X(this.readLong());
   }

   public h B(j var1) {
      this.writeLong(var1.F());
      return this;
   }

   public net.cb.t g() throws IOException {
      return net.cb.t.m(this.Z(32767));
   }

   public h p(net.cb.t var1) {
      return this.R(net.cb.t.m(var1));
   }

   public Enum S(Class var1) {
      return ((Enum[])((Enum[])var1.getEnumConstants()))[this.q()];
   }

   public h A(Enum var1) {
      return this.a(var1.ordinal());
   }

   public int q() {
      int var1 = 0;
      int var2 = 0;

      while(true) {
         byte var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if(var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }

         if((var3 & 128) != 128) {
            break;
         }
      }

      return var1;
   }

   public long M() {
      long var1 = 0L;
      int var3 = 0;

      while(true) {
         byte var4 = this.readByte();
         var1 |= (long)(var4 & 127) << var3++ * 7;
         if(var3 > 10) {
            throw new RuntimeException("VarLong too big");
         }

         if((var4 & 128) != 128) {
            break;
         }
      }

      return var1;
   }

   public h l(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public UUID J() {
      return new UUID(this.readLong(), this.readLong());
   }

   public h a(int var1) {
      while((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
      return this;
   }

   public h N(long var1) {
      while((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
      return this;
   }

   public h e(@Nullable f var1) {
      this.writeByte(0);
      return this;
   }

   @Nullable
   public f A() throws IOException {
      this.readerIndex();
      byte var2 = this.readByte();
      return null;
   }

   public h D(ks var1) {
      if(var1.B()) {
         this.writeShort(-1);
      } else {
         this.writeShort(net.n0.y.h(var1.Z()));
         this.writeByte(var1.U());
         this.writeShort(var1.n());
         f var2 = null;
         if(var1.Z().P() || var1.Z().x()) {
            var2 = var1.o();
         }

         this.e(var2);
      }

      return this;
   }

   public ks C() throws IOException {
      short var1 = this.readShort();
      return ks.a;
   }

   public String Z(int var1) {
      X();
      int var3 = this.q();
      if(var3 > var1 * 4) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var3 + " > " + var1 * 4 + ")");
      } else if(var3 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         String var4 = this.toString(this.readerIndex(), var3, StandardCharsets.UTF_8);
         this.readerIndex(this.readerIndex() + var3);
         if(var4.length() > var1) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + var3 + " > " + var1 + ")");
         } else {
            return var4;
         }
      }
   }

   public h R(String var1) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
      if(var2.length > 32767) {
         throw new EncoderException("String too big (was " + var2.length + " bytes encoded, max " + 32767 + ")");
      } else {
         this.a(var2.length);
         this.writeBytes(var2);
         return this;
      }
   }

   public m_ z() {
      return new m_(this.Z(32767));
   }

   public h Q(m_ var1) {
      this.R(var1.toString());
      return this;
   }

   public Date z() {
      return new Date(this.readLong());
   }

   public h M(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public int capacity() {
      return this.K.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.K.capacity(var1);
   }

   public int maxCapacity() {
      return this.K.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.K.alloc();
   }

   public ByteOrder order() {
      return this.K.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.K.order(var1);
   }

   public ByteBuf unwrap() {
      return this.K.unwrap();
   }

   public boolean isDirect() {
      return this.K.isDirect();
   }

   public boolean isReadOnly() {
      return this.K.isReadOnly();
   }

   public ByteBuf asReadOnly() {
      return this.K.asReadOnly();
   }

   public int readerIndex() {
      return this.K.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.K.readerIndex(var1);
   }

   public int writerIndex() {
      return this.K.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.K.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.K.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.K.readableBytes();
   }

   public int writableBytes() {
      return this.K.writableBytes();
   }

   public int maxWritableBytes() {
      return this.K.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.K.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.K.isReadable(var1);
   }

   public boolean isWritable() {
      return this.K.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.K.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.K.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.K.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.K.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.K.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.K.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.K.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.K.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.K.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.K.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.K.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.K.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.K.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.K.getShort(var1);
   }

   public short getShortLE(int var1) {
      return this.K.getShortLE(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.K.getUnsignedShort(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.K.getUnsignedShortLE(var1);
   }

   public int getMedium(int var1) {
      return this.K.getMedium(var1);
   }

   public int getMediumLE(int var1) {
      return this.K.getMediumLE(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.K.getUnsignedMedium(var1);
   }

   public int getUnsignedMediumLE(int var1) {
      return this.K.getUnsignedMediumLE(var1);
   }

   public int getInt(int var1) {
      return this.K.getInt(var1);
   }

   public int getIntLE(int var1) {
      return this.K.getIntLE(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.K.getUnsignedInt(var1);
   }

   public long getUnsignedIntLE(int var1) {
      return this.K.getUnsignedIntLE(var1);
   }

   public long getLong(int var1) {
      return this.K.getLong(var1);
   }

   public long getLongLE(int var1) {
      return this.K.getLongLE(var1);
   }

   public char getChar(int var1) {
      return this.K.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.K.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.K.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.K.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.K.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.K.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.K.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.K.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.K.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) throws IOException {
      return this.K.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.K.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.K.getBytes(var1, var2, var3, var5);
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.K.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.K.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.K.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.K.setShort(var1, var2);
   }

   public ByteBuf setShortLE(int var1, int var2) {
      return this.K.setShortLE(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.K.setMedium(var1, var2);
   }

   public ByteBuf setMediumLE(int var1, int var2) {
      return this.K.setMediumLE(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.K.setInt(var1, var2);
   }

   public ByteBuf setIntLE(int var1, int var2) {
      return this.K.setIntLE(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.K.setLong(var1, var2);
   }

   public ByteBuf setLongLE(int var1, long var2) {
      return this.K.setLongLE(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.K.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.K.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.K.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.K.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.K.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.K.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.K.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.K.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.K.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.K.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.K.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.K.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.K.setZero(var1, var2);
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.K.setCharSequence(var1, var2, var3);
   }

   public boolean readBoolean() {
      return this.K.readBoolean();
   }

   public byte readByte() {
      return this.K.readByte();
   }

   public short readUnsignedByte() {
      return this.K.readUnsignedByte();
   }

   public short readShort() {
      return this.K.readShort();
   }

   public short readShortLE() {
      return this.K.readShortLE();
   }

   public int readUnsignedShort() {
      return this.K.readUnsignedShort();
   }

   public int readUnsignedShortLE() {
      return this.K.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.K.readMedium();
   }

   public int readMediumLE() {
      return this.K.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.K.readUnsignedMedium();
   }

   public int readUnsignedMediumLE() {
      return this.K.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.K.readInt();
   }

   public int readIntLE() {
      return this.K.readIntLE();
   }

   public long readUnsignedInt() {
      return this.K.readUnsignedInt();
   }

   public long readUnsignedIntLE() {
      return this.K.readUnsignedIntLE();
   }

   public long readLong() {
      return this.K.readLong();
   }

   public long readLongLE() {
      return this.K.readLongLE();
   }

   public char readChar() {
      return this.K.readChar();
   }

   public float readFloat() {
      return this.K.readFloat();
   }

   public double readDouble() {
      return this.K.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.K.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.K.readSlice(var1);
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.K.readRetainedSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.K.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.K.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.K.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.K.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.K.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.K.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) throws IOException {
      return this.K.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.K.readBytes(var1, var2);
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.K.readCharSequence(var1, var2);
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.K.readBytes(var1, var2, var4);
   }

   public ByteBuf skipBytes(int var1) {
      return this.K.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.K.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.K.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.K.writeShort(var1);
   }

   public ByteBuf writeShortLE(int var1) {
      return this.K.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.K.writeMedium(var1);
   }

   public ByteBuf writeMediumLE(int var1) {
      return this.K.writeMediumLE(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.K.writeInt(var1);
   }

   public ByteBuf writeIntLE(int var1) {
      return this.K.writeIntLE(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.K.writeLong(var1);
   }

   public ByteBuf writeLongLE(long var1) {
      return this.K.writeLongLE(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.K.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.K.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.K.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.K.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.K.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.K.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.K.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.K.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.K.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.K.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.K.writeBytes(var1, var2);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.K.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeZero(int var1) {
      return this.K.writeZero(var1);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.K.writeCharSequence(var1, var2);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.K.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.K.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.K.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.K.bytesBefore(var1, var2, var3);
   }

   public int forEachByte(ByteProcessor var1) {
      return this.K.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.K.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.K.forEachByteDesc(var1);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.K.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.K.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.K.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.K.slice();
   }

   public ByteBuf retainedSlice() {
      return this.K.retainedSlice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.K.slice(var1, var2);
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.K.retainedSlice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.K.duplicate();
   }

   public ByteBuf retainedDuplicate() {
      return this.K.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.K.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.K.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.K.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.K.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.K.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.K.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.K.hasArray();
   }

   public byte[] array() {
      return this.K.array();
   }

   public int arrayOffset() {
      return this.K.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.K.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.K.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.K.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.K.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.K.hashCode();
   }

   public boolean equals(Object var1) {
      return this.K.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.K.compareTo(var1);
   }

   public String toString() {
      return this.K.toString();
   }

   public ByteBuf retain(int var1) {
      return this.K.retain(var1);
   }

   public ByteBuf retain() {
      return this.K.retain();
   }

   public ByteBuf touch() {
      return this.K.touch();
   }

   public ByteBuf touch(Object var1) {
      return this.K.touch(var1);
   }

   public int refCnt() {
      return this.K.refCnt();
   }

   public boolean release() {
      return this.K.release();
   }

   public boolean release(int var1) {
      return this.K.release(var1);
   }

   public static void h(int var0) {
      q = var0;
   }

   public static int X() {
      return q;
   }

   public static int w() {
      int var0 = X();
      return 72;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      h(109);
   }
}
