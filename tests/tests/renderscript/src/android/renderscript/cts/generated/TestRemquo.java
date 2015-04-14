/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Don't edit this file!  It is auto-generated by frameworks/rs/api/generate.sh.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestRemquo extends RSBaseCompute {

    private ScriptC_TestRemquo script;
    private ScriptC_TestRemquoRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestRemquo(mRS);
        scriptRelaxed = new ScriptC_TestRemquoRelaxed(mRS);
    }

    public class ArgumentsFloatFloatIntFloat {
        public float inNumerator;
        public float inDenominator;
        public int outQuotient;
        public float out;
    }

    private void checkRemquoFloatFloatIntFloat() {
        Allocation inNumerator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xcd5efc69edd4ff2al, false);
        Allocation inDenominator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x4ff0c9312eb19f93l, false);
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInDenominator(inDenominator);
            script.set_gAllocOutQuotient(outQuotient);
            script.forEach_testRemquoFloatFloatIntFloat(inNumerator, out);
            verifyResultsRemquoFloatFloatIntFloat(inNumerator, inDenominator, outQuotient, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloatFloatIntFloat: " + e.toString());
        }
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInDenominator(inDenominator);
            scriptRelaxed.set_gAllocOutQuotient(outQuotient);
            scriptRelaxed.forEach_testRemquoFloatFloatIntFloat(inNumerator, out);
            verifyResultsRemquoFloatFloatIntFloat(inNumerator, inDenominator, outQuotient, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloatFloatIntFloat: " + e.toString());
        }
    }

    private void verifyResultsRemquoFloatFloatIntFloat(Allocation inNumerator, Allocation inDenominator, Allocation outQuotient, Allocation out, boolean relaxed) {
        float[] arrayInNumerator = new float[INPUTSIZE * 1];
        inNumerator.copyTo(arrayInNumerator);
        float[] arrayInDenominator = new float[INPUTSIZE * 1];
        inDenominator.copyTo(arrayInDenominator);
        int[] arrayOutQuotient = new int[INPUTSIZE * 1];
        outQuotient.copyTo(arrayOutQuotient);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatIntFloat args = new ArgumentsFloatFloatIntFloat();
                args.inNumerator = arrayInNumerator[i];
                args.inDenominator = arrayInDenominator[i];
                // Extract the outputs.
                args.outQuotient = arrayOutQuotient[i * 1 + j];
                args.out = arrayOut[i * 1 + j];
                // Ask the CoreMathVerifier to validate.
                Target target = new Target(relaxed);
                String errorMessage = CoreMathVerifier.verifyRemquo(args, target);
                boolean valid = errorMessage == null;
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inNumerator: ");
                    appendVariableToMessage(message, args.inNumerator);
                    message.append("\n");
                    message.append("Input inDenominator: ");
                    appendVariableToMessage(message, args.inDenominator);
                    message.append("\n");
                    message.append("Output outQuotient: ");
                    appendVariableToMessage(message, args.outQuotient);
                    message.append("\n");
                    message.append("Output out: ");
                    appendVariableToMessage(message, args.out);
                    message.append("\n");
                    message.append(errorMessage);
                    assertTrue("Incorrect output for checkRemquoFloatFloatIntFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkRemquoFloat2Float2Int2Float2() {
        Allocation inNumerator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x28c14abc3a27171al, false);
        Allocation inDenominator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x58f8799a6ba08403l, false);
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInDenominator(inDenominator);
            script.set_gAllocOutQuotient(outQuotient);
            script.forEach_testRemquoFloat2Float2Int2Float2(inNumerator, out);
            verifyResultsRemquoFloat2Float2Int2Float2(inNumerator, inDenominator, outQuotient, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat2Float2Int2Float2: " + e.toString());
        }
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInDenominator(inDenominator);
            scriptRelaxed.set_gAllocOutQuotient(outQuotient);
            scriptRelaxed.forEach_testRemquoFloat2Float2Int2Float2(inNumerator, out);
            verifyResultsRemquoFloat2Float2Int2Float2(inNumerator, inDenominator, outQuotient, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat2Float2Int2Float2: " + e.toString());
        }
    }

    private void verifyResultsRemquoFloat2Float2Int2Float2(Allocation inNumerator, Allocation inDenominator, Allocation outQuotient, Allocation out, boolean relaxed) {
        float[] arrayInNumerator = new float[INPUTSIZE * 2];
        inNumerator.copyTo(arrayInNumerator);
        float[] arrayInDenominator = new float[INPUTSIZE * 2];
        inDenominator.copyTo(arrayInDenominator);
        int[] arrayOutQuotient = new int[INPUTSIZE * 2];
        outQuotient.copyTo(arrayOutQuotient);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatIntFloat args = new ArgumentsFloatFloatIntFloat();
                args.inNumerator = arrayInNumerator[i * 2 + j];
                args.inDenominator = arrayInDenominator[i * 2 + j];
                // Extract the outputs.
                args.outQuotient = arrayOutQuotient[i * 2 + j];
                args.out = arrayOut[i * 2 + j];
                // Ask the CoreMathVerifier to validate.
                Target target = new Target(relaxed);
                String errorMessage = CoreMathVerifier.verifyRemquo(args, target);
                boolean valid = errorMessage == null;
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inNumerator: ");
                    appendVariableToMessage(message, args.inNumerator);
                    message.append("\n");
                    message.append("Input inDenominator: ");
                    appendVariableToMessage(message, args.inDenominator);
                    message.append("\n");
                    message.append("Output outQuotient: ");
                    appendVariableToMessage(message, args.outQuotient);
                    message.append("\n");
                    message.append("Output out: ");
                    appendVariableToMessage(message, args.out);
                    message.append("\n");
                    message.append(errorMessage);
                    assertTrue("Incorrect output for checkRemquoFloat2Float2Int2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkRemquoFloat3Float3Int3Float3() {
        Allocation inNumerator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xf60211df96052526l, false);
        Allocation inDenominator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xd1d6c7fcf273f8afl, false);
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInDenominator(inDenominator);
            script.set_gAllocOutQuotient(outQuotient);
            script.forEach_testRemquoFloat3Float3Int3Float3(inNumerator, out);
            verifyResultsRemquoFloat3Float3Int3Float3(inNumerator, inDenominator, outQuotient, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat3Float3Int3Float3: " + e.toString());
        }
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInDenominator(inDenominator);
            scriptRelaxed.set_gAllocOutQuotient(outQuotient);
            scriptRelaxed.forEach_testRemquoFloat3Float3Int3Float3(inNumerator, out);
            verifyResultsRemquoFloat3Float3Int3Float3(inNumerator, inDenominator, outQuotient, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat3Float3Int3Float3: " + e.toString());
        }
    }

    private void verifyResultsRemquoFloat3Float3Int3Float3(Allocation inNumerator, Allocation inDenominator, Allocation outQuotient, Allocation out, boolean relaxed) {
        float[] arrayInNumerator = new float[INPUTSIZE * 4];
        inNumerator.copyTo(arrayInNumerator);
        float[] arrayInDenominator = new float[INPUTSIZE * 4];
        inDenominator.copyTo(arrayInDenominator);
        int[] arrayOutQuotient = new int[INPUTSIZE * 4];
        outQuotient.copyTo(arrayOutQuotient);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatIntFloat args = new ArgumentsFloatFloatIntFloat();
                args.inNumerator = arrayInNumerator[i * 4 + j];
                args.inDenominator = arrayInDenominator[i * 4 + j];
                // Extract the outputs.
                args.outQuotient = arrayOutQuotient[i * 4 + j];
                args.out = arrayOut[i * 4 + j];
                // Ask the CoreMathVerifier to validate.
                Target target = new Target(relaxed);
                String errorMessage = CoreMathVerifier.verifyRemquo(args, target);
                boolean valid = errorMessage == null;
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inNumerator: ");
                    appendVariableToMessage(message, args.inNumerator);
                    message.append("\n");
                    message.append("Input inDenominator: ");
                    appendVariableToMessage(message, args.inDenominator);
                    message.append("\n");
                    message.append("Output outQuotient: ");
                    appendVariableToMessage(message, args.outQuotient);
                    message.append("\n");
                    message.append("Output out: ");
                    appendVariableToMessage(message, args.out);
                    message.append("\n");
                    message.append(errorMessage);
                    assertTrue("Incorrect output for checkRemquoFloat3Float3Int3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkRemquoFloat4Float4Int4Float4() {
        Allocation inNumerator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xc342d902f1e33332l, false);
        Allocation inDenominator = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x4ab5165f79476d5bl, false);
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInDenominator(inDenominator);
            script.set_gAllocOutQuotient(outQuotient);
            script.forEach_testRemquoFloat4Float4Int4Float4(inNumerator, out);
            verifyResultsRemquoFloat4Float4Int4Float4(inNumerator, inDenominator, outQuotient, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat4Float4Int4Float4: " + e.toString());
        }
        try {
            Allocation outQuotient = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInDenominator(inDenominator);
            scriptRelaxed.set_gAllocOutQuotient(outQuotient);
            scriptRelaxed.forEach_testRemquoFloat4Float4Int4Float4(inNumerator, out);
            verifyResultsRemquoFloat4Float4Int4Float4(inNumerator, inDenominator, outQuotient, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testRemquoFloat4Float4Int4Float4: " + e.toString());
        }
    }

    private void verifyResultsRemquoFloat4Float4Int4Float4(Allocation inNumerator, Allocation inDenominator, Allocation outQuotient, Allocation out, boolean relaxed) {
        float[] arrayInNumerator = new float[INPUTSIZE * 4];
        inNumerator.copyTo(arrayInNumerator);
        float[] arrayInDenominator = new float[INPUTSIZE * 4];
        inDenominator.copyTo(arrayInDenominator);
        int[] arrayOutQuotient = new int[INPUTSIZE * 4];
        outQuotient.copyTo(arrayOutQuotient);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatIntFloat args = new ArgumentsFloatFloatIntFloat();
                args.inNumerator = arrayInNumerator[i * 4 + j];
                args.inDenominator = arrayInDenominator[i * 4 + j];
                // Extract the outputs.
                args.outQuotient = arrayOutQuotient[i * 4 + j];
                args.out = arrayOut[i * 4 + j];
                // Ask the CoreMathVerifier to validate.
                Target target = new Target(relaxed);
                String errorMessage = CoreMathVerifier.verifyRemquo(args, target);
                boolean valid = errorMessage == null;
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inNumerator: ");
                    appendVariableToMessage(message, args.inNumerator);
                    message.append("\n");
                    message.append("Input inDenominator: ");
                    appendVariableToMessage(message, args.inDenominator);
                    message.append("\n");
                    message.append("Output outQuotient: ");
                    appendVariableToMessage(message, args.outQuotient);
                    message.append("\n");
                    message.append("Output out: ");
                    appendVariableToMessage(message, args.out);
                    message.append("\n");
                    message.append(errorMessage);
                    assertTrue("Incorrect output for checkRemquoFloat4Float4Int4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testRemquo() {
        checkRemquoFloatFloatIntFloat();
        checkRemquoFloat2Float2Int2Float2();
        checkRemquoFloat3Float3Int3Float3();
        checkRemquoFloat4Float4Int4Float4();
    }
}
