// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: msggateway.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import com.lbe.imsdk.model.proto.IMMsg

@kotlin.jvm.JvmName("-initializejoin")
public inline fun join(block: JoinKt.Dsl.() -> kotlin.Unit): IMMsg.Join =
  JoinKt.Dsl._create(IMMsg.Join.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `Join`
 */
public object JoinKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: IMMsg.Join.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: IMMsg.Join.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): IMMsg.Join = _builder.build()

    /**
     * `string uid = 1;`
     */
    public var uid: kotlin.String
      @JvmName("getUid")
      get() = _builder.uid
      @JvmName("setUid")
      set(value) {
        _builder.uid = value
      }
    /**
     * `string uid = 1;`
     */
    public fun clearUid() {
      _builder.clearUid()
    }

    /**
     * `string sessionId = 2;`
     */
    public var sessionId: kotlin.String
      @JvmName("getSessionId")
      get() = _builder.sessionId
      @JvmName("setSessionId")
      set(value) {
        _builder.sessionId = value
      }
    /**
     * `string sessionId = 2;`
     */
    public fun clearSessionId() {
      _builder.clearSessionId()
    }

    /**
     * `string token = 3;`
     */
    public var token: kotlin.String
      @JvmName("getToken")
      get() = _builder.token
      @JvmName("setToken")
      set(value) {
        _builder.token = value
      }
    /**
     * `string token = 3;`
     */
    public fun clearToken() {
      _builder.clearToken()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun IMMsg.Join.copy(block: JoinKt.Dsl.() -> kotlin.Unit): IMMsg.Join =
  JoinKt.Dsl._create(this.toBuilder()).apply { block() }._build()

