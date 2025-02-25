import com.android.build.api.variant.ResValue

plugins {
        id("com.android.application")
        kotlin("android")
}
android {
    namespace = "com.android.build.example.minimal"
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
    }
}

androidComponents {
    onVariants { variant ->
        variant.resValues.put(variant.makeResValueKey("string", "VariantName"),
            ResValue(name, "Variant Name"))
    }
}