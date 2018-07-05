/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileKotlinAgainstKotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompileKotlinAgainstKotlinTestGenerated extends AbstractCompileKotlinAgainstKotlinTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
        KotlinTestUtils.runTest(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInCompileKotlinAgainstKotlin() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotationInInterface.kt")
    public void testAnnotationInInterface() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/annotationInInterface.kt");
    }

    @TestMetadata("annotationsOnTypeAliases.kt")
    public void testAnnotationsOnTypeAliases() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/annotationsOnTypeAliases.kt");
    }

    @TestMetadata("callDeserializedPropertyOnInlineClassType.kt")
    public void testCallDeserializedPropertyOnInlineClassType() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/callDeserializedPropertyOnInlineClassType.kt");
    }

    @TestMetadata("callsToMultifileClassFromOtherPackage.kt")
    public void testCallsToMultifileClassFromOtherPackage() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/callsToMultifileClassFromOtherPackage.kt");
    }

    @TestMetadata("classInObject.kt")
    public void testClassInObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/classInObject.kt");
    }

    @TestMetadata("companionObjectInEnum.kt")
    public void testCompanionObjectInEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/companionObjectInEnum.kt");
    }

    @TestMetadata("companionObjectMember.kt")
    public void testCompanionObjectMember() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/companionObjectMember.kt");
    }

    @TestMetadata("constPropertyReferenceFromMultifileClass.kt")
    public void testConstPropertyReferenceFromMultifileClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/constPropertyReferenceFromMultifileClass.kt");
    }

    @TestMetadata("constructorVararg.kt")
    public void testConstructorVararg() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/constructorVararg.kt");
    }

    @TestMetadata("copySamOnInline.kt")
    public void testCopySamOnInline() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/copySamOnInline.kt");
    }

    @TestMetadata("copySamOnInline2.kt")
    public void testCopySamOnInline2() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/copySamOnInline2.kt");
    }

    @TestMetadata("coroutinesBinary.kt")
    public void testCoroutinesBinary_1_2() throws Exception {
        runTestWithPackageReplacement("compiler/testData/compileKotlinAgainstKotlin/coroutinesBinary.kt", "kotlin.coroutines.experimental");
    }

    @TestMetadata("coroutinesBinary.kt")
    public void testCoroutinesBinary_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/compileKotlinAgainstKotlin/coroutinesBinary.kt", "kotlin.coroutines");
    }

    @TestMetadata("defaultConstructor.kt")
    public void testDefaultConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultConstructor.kt");
    }

    @TestMetadata("defaultLambdaRegeneration.kt")
    public void testDefaultLambdaRegeneration() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration.kt");
    }

    @TestMetadata("defaultLambdaRegeneration2.kt")
    public void testDefaultLambdaRegeneration2() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration2.kt");
    }

    @TestMetadata("doublyNestedClass.kt")
    public void testDoublyNestedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/doublyNestedClass.kt");
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/enum.kt");
    }

    @TestMetadata("inlinedConstants.kt")
    public void testInlinedConstants() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/inlinedConstants.kt");
    }

    @TestMetadata("innerClassConstructor.kt")
    public void testInnerClassConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/innerClassConstructor.kt");
    }

    @TestMetadata("internalSetterOverridden.kt")
    public void testInternalSetterOverridden() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/internalSetterOverridden.kt");
    }

    @TestMetadata("jvmField.kt")
    public void testJvmField() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmField.kt");
    }

    @TestMetadata("jvmFieldInConstructor.kt")
    public void testJvmFieldInConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmFieldInConstructor.kt");
    }

    @TestMetadata("jvmNames.kt")
    public void testJvmNames() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmNames.kt");
    }

    @TestMetadata("jvmPackageName.kt")
    public void testJvmPackageName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageName.kt");
    }

    @TestMetadata("jvmPackageNameInRootPackage.kt")
    public void testJvmPackageNameInRootPackage() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameInRootPackage.kt");
    }

    @TestMetadata("jvmPackageNameWithJvmName.kt")
    public void testJvmPackageNameWithJvmName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameWithJvmName.kt");
    }

    @TestMetadata("jvmStaticInObject.kt")
    public void testJvmStaticInObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmStaticInObject.kt");
    }

    @TestMetadata("kotlinPropertyAsAnnotationParameter.kt")
    public void testKotlinPropertyAsAnnotationParameter() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kotlinPropertyAsAnnotationParameter.kt");
    }

    @TestMetadata("kt14012.kt")
    public void testKt14012() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kt14012.kt");
    }

    @TestMetadata("kt14012_multi.kt")
    public void testKt14012_multi() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kt14012_multi.kt");
    }

    @TestMetadata("multifileClassInlineFunctionAccessingProperty.kt")
    public void testMultifileClassInlineFunctionAccessingProperty() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/multifileClassInlineFunctionAccessingProperty.kt");
    }

    @TestMetadata("multifileClassWithTypealias.kt")
    public void testMultifileClassWithTypealias() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/multifileClassWithTypealias.kt");
    }

    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedClass.kt");
    }

    @TestMetadata("nestedEnum.kt")
    public void testNestedEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedEnum.kt");
    }

    @TestMetadata("nestedObject.kt")
    public void testNestedObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedObject.kt");
    }

    @TestMetadata("optionalAnnotation.kt")
    public void testOptionalAnnotation() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/optionalAnnotation.kt");
    }

    @TestMetadata("platformTypes.kt")
    public void testPlatformTypes() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/platformTypes.kt");
    }

    @TestMetadata("propertyReference.kt")
    public void testPropertyReference() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/propertyReference.kt");
    }

    @TestMetadata("recursiveGeneric.kt")
    public void testRecursiveGeneric() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/recursiveGeneric.kt");
    }

    @TestMetadata("reflectTopLevelFunctionOtherFile.kt")
    public void testReflectTopLevelFunctionOtherFile() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/reflectTopLevelFunctionOtherFile.kt");
    }

    @TestMetadata("sealedClass.kt")
    public void testSealedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/sealedClass.kt");
    }

    @TestMetadata("secondaryConstructors.kt")
    public void testSecondaryConstructors() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/secondaryConstructors.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/simple.kt");
    }

    @TestMetadata("simpleValAnonymousObject.kt")
    public void testSimpleValAnonymousObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/simpleValAnonymousObject.kt");
    }

    @TestMetadata("starImportEnum.kt")
    public void testStarImportEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/starImportEnum.kt");
    }

    @TestMetadata("targetedJvmName.kt")
    public void testTargetedJvmName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/targetedJvmName.kt");
    }

    @TestMetadata("typeAliasesKt13181.kt")
    public void testTypeAliasesKt13181() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/typeAliasesKt13181.kt");
    }

    @TestMetadata("unsignedTypesInAnnotations.kt")
    public void testUnsignedTypesInAnnotations() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/unsignedTypesInAnnotations.kt");
    }

    @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/coroutines")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Coroutines extends AbstractCompileKotlinAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInCoroutines() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/coroutines"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/compileKotlinAgainstKotlin/coroutines/simple.kt");
        }
    }
}
