// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: msggateway.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

import info.hermiths.chatapp.service.proto.IMMsg;

@kotlin.jvm.JvmName("-initializetalkText")
public inline fun talkText(block: TalkTextKt.Dsl.() -> kotlin.Unit): IMMsg.TalkText =
  TalkTextKt.Dsl._create(IMMsg.TalkText.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `TalkText`
 */
public object TalkTextKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: IMMsg.TalkText.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: IMMsg.TalkText.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): IMMsg.TalkText = _builder.build()

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
     * `string content = 2;`
     */
    public var content: kotlin.String
      @JvmName("getContent")
      get() = _builder.content
      @JvmName("setContent")
      set(value) {
        _builder.content = value
      }
    /**
     * `string content = 2;`
     */
    public fun clearContent() {
      _builder.clearContent()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun IMMsg.TalkText.copy(block: TalkTextKt.Dsl.() -> kotlin.Unit): IMMsg.TalkText =
  TalkTextKt.Dsl._create(this.toBuilder()).apply { block() }._build()

