/*
 * Copyright (C) 2014 The Android Open Source Project
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

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestLgamma extends RSBaseCompute {

    private ScriptC_TestLgamma script;
    private ScriptC_TestLgammaRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestLgamma(mRS);
        scriptRelaxed = new ScriptC_TestLgammaRelaxed(mRS);
    }

    public class ArgumentsFloatFloat {
        public float in;
        public Floaty out;
    }

    private void checkLgammaFloatFloat() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xe748c67429cab138l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.forEach_testLgammaFloatFloat(in, out);
            verifyResultsLgammaFloatFloat(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.forEach_testLgammaFloatFloat(in, out);
            verifyResultsLgammaFloatFloat(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloatFloat(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 1];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input in: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat2Float2() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x7ca07efd8a327894l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.forEach_testLgammaFloat2Float2(in, out);
            verifyResultsLgammaFloat2Float2(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.forEach_testLgammaFloat2Float2(in, out);
            verifyResultsLgammaFloat2Float2(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat2Float2: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat2Float2(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 2];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 2 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input in: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat3Float3() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x7ca0899ee9390e2el, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.forEach_testLgammaFloat3Float3(in, out);
            verifyResultsLgammaFloat3Float3(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.forEach_testLgammaFloat3Float3(in, out);
            verifyResultsLgammaFloat3Float3(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat3Float3: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat3Float3(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 4];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input in: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat4Float4() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x7ca09440483fa3c8l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.forEach_testLgammaFloat4Float4(in, out);
            verifyResultsLgammaFloat4Float4(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.forEach_testLgammaFloat4Float4(in, out);
            verifyResultsLgammaFloat4Float4(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat4Float4: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat4Float4(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 4];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input in: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public class ArgumentsFloatIntFloat {
        public float inX;
        public int outY;
        public Floaty out;
    }

    private void checkLgammaFloatIntFloat() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x2a62d992979c4bb9l, false);
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocOutY(outY);
            script.forEach_testLgammaFloatIntFloat(inX, out);
            verifyResultsLgammaFloatIntFloat(inX, outY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloatIntFloat: " + e.toString());
        }
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocOutY(outY);
            scriptRelaxed.forEach_testLgammaFloatIntFloat(inX, out);
            verifyResultsLgammaFloatIntFloat(inX, outY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloatIntFloat: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloatIntFloat(Allocation inX, Allocation outY, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 1];
        inX.copyTo(arrayInX);
        int[] arrayOutY = new int[INPUTSIZE * 1];
        outY.copyTo(arrayOutY);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatIntFloat args = new ArgumentsFloatIntFloat();
                args.inX = arrayInX[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (args.outY != arrayOutY[i * 1 + j]) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outY: ");
                    message.append(String.format("%d", args.outY));
                    message.append("\n");
                    message.append("Actual   output outY: ");
                    message.append(String.format("%d", arrayOutY[i * 1 + j]));
                    if (args.outY != arrayOutY[i * 1 + j]) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloatIntFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat2Int2Float2() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x409fb9a5984bcf81l, false);
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocOutY(outY);
            script.forEach_testLgammaFloat2Int2Float2(inX, out);
            verifyResultsLgammaFloat2Int2Float2(inX, outY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat2Int2Float2: " + e.toString());
        }
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocOutY(outY);
            scriptRelaxed.forEach_testLgammaFloat2Int2Float2(inX, out);
            verifyResultsLgammaFloat2Int2Float2(inX, outY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat2Int2Float2: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat2Int2Float2(Allocation inX, Allocation outY, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 2];
        inX.copyTo(arrayInX);
        int[] arrayOutY = new int[INPUTSIZE * 2];
        outY.copyTo(arrayOutY);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatIntFloat args = new ArgumentsFloatIntFloat();
                args.inX = arrayInX[i * 2 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (args.outY != arrayOutY[i * 2 + j]) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outY: ");
                    message.append(String.format("%d", args.outY));
                    message.append("\n");
                    message.append("Actual   output outY: ");
                    message.append(String.format("%d", arrayOutY[i * 2 + j]));
                    if (args.outY != arrayOutY[i * 2 + j]) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat2Int2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat3Int3Float3() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x6655f8088dfe3c3al, false);
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocOutY(outY);
            script.forEach_testLgammaFloat3Int3Float3(inX, out);
            verifyResultsLgammaFloat3Int3Float3(inX, outY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat3Int3Float3: " + e.toString());
        }
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocOutY(outY);
            scriptRelaxed.forEach_testLgammaFloat3Int3Float3(inX, out);
            verifyResultsLgammaFloat3Int3Float3(inX, outY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat3Int3Float3: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat3Int3Float3(Allocation inX, Allocation outY, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        int[] arrayOutY = new int[INPUTSIZE * 4];
        outY.copyTo(arrayOutY);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatIntFloat args = new ArgumentsFloatIntFloat();
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (args.outY != arrayOutY[i * 4 + j]) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outY: ");
                    message.append(String.format("%d", args.outY));
                    message.append("\n");
                    message.append("Actual   output outY: ");
                    message.append(String.format("%d", arrayOutY[i * 4 + j]));
                    if (args.outY != arrayOutY[i * 4 + j]) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat3Int3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkLgammaFloat4Int4Float4() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x8c0c366b83b0a8f3l, false);
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocOutY(outY);
            script.forEach_testLgammaFloat4Int4Float4(inX, out);
            verifyResultsLgammaFloat4Int4Float4(inX, outY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat4Int4Float4: " + e.toString());
        }
        try {
            Allocation outY = Allocation.createSized(mRS, getElement(mRS, Element.DataType.SIGNED_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocOutY(outY);
            scriptRelaxed.forEach_testLgammaFloat4Int4Float4(inX, out);
            verifyResultsLgammaFloat4Int4Float4(inX, outY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testLgammaFloat4Int4Float4: " + e.toString());
        }
    }

    private void verifyResultsLgammaFloat4Int4Float4(Allocation inX, Allocation outY, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        int[] arrayOutY = new int[INPUTSIZE * 4];
        outY.copyTo(arrayOutY);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatIntFloat args = new ArgumentsFloatIntFloat();
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeLgamma(args);
                // Validate the outputs.
                boolean valid = true;
                if (args.outY != arrayOutY[i * 4 + j]) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outY: ");
                    message.append(String.format("%d", args.outY));
                    message.append("\n");
                    message.append("Actual   output outY: ");
                    message.append(String.format("%d", arrayOutY[i * 4 + j]));
                    if (args.outY != arrayOutY[i * 4 + j]) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkLgammaFloat4Int4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testLgamma() {
        checkLgammaFloatFloat();
        checkLgammaFloat2Float2();
        checkLgammaFloat3Float3();
        checkLgammaFloat4Float4();
        checkLgammaFloatIntFloat();
        checkLgammaFloat2Int2Float2();
        checkLgammaFloat3Int3Float3();
        checkLgammaFloat4Int4Float4();
    }
}
