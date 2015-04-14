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

public class TestDistance extends RSBaseCompute {

    private ScriptC_TestDistance script;
    private ScriptC_TestDistanceRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestDistance(mRS);
        scriptRelaxed = new ScriptC_TestDistanceRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inLeftVector;
        public float inRightVector;
        public Target.Floaty out;
    }

    private void checkDistanceFloatFloatFloat() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xa481527082ced52al, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xa38cb25366d69793l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testDistanceFloatFloatFloat(inLeftVector, out);
            verifyResultsDistanceFloatFloatFloat(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testDistanceFloatFloatFloat(inLeftVector, out);
            verifyResultsDistanceFloatFloatFloat(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsDistanceFloatFloatFloat(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 1];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 1];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
            // Create the appropriate sized arrays in args
            // Fill args with the input values
            args.inLeftVector = arrayInLeftVector[i];
            args.inRightVector = arrayInRightVector[i];
            Target target = new Target(relaxed);
            CoreMathVerifier.computeDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                message.append("Input inLeftVector: ");
                appendVariableToMessage(message, arrayInLeftVector[i]);
                message.append("\n");
                message.append("Input inRightVector: ");
                appendVariableToMessage(message, arrayInRightVector[i]);
                message.append("\n");
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkDistanceFloatFloatFloat" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public class ArgumentsFloatNFloatNFloat {
        public float[] inLeftVector;
        public float[] inRightVector;
        public Target.Floaty out;
    }

    private void checkDistanceFloat2Float2Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xbf71d23b554dab2el, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x29f22964c2248a3fl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testDistanceFloat2Float2Float(inLeftVector, out);
            verifyResultsDistanceFloat2Float2Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat2Float2Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testDistanceFloat2Float2Float(inLeftVector, out);
            verifyResultsDistanceFloat2Float2Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat2Float2Float: " + e.toString());
        }
    }

    private void verifyResultsDistanceFloat2Float2Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 2];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 2];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[2];
            args.inRightVector = new float[2];
            // Fill args with the input values
            for (int j = 0; j < 2 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 2 + j];
            }
            for (int j = 0; j < 2 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 2 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 2 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 2 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkDistanceFloat2Float2Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkDistanceFloat3Float3Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x8e1af7b976ec5f7cl, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xe05b759467ccd359l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testDistanceFloat3Float3Float(inLeftVector, out);
            verifyResultsDistanceFloat3Float3Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat3Float3Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testDistanceFloat3Float3Float(inLeftVector, out);
            verifyResultsDistanceFloat3Float3Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat3Float3Float: " + e.toString());
        }
    }

    private void verifyResultsDistanceFloat3Float3Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 4];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 4];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[3];
            args.inRightVector = new float[3];
            // Fill args with the input values
            for (int j = 0; j < 3 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 4 + j];
            }
            for (int j = 0; j < 3 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 4 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 4 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 4 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkDistanceFloat3Float3Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkDistanceFloat4Float4Float() {
        Allocation inLeftVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x5cc41d37988b13cal, false);
        Allocation inRightVector = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x96c4c1c40d751c73l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRightVector(inRightVector);
            script.forEach_testDistanceFloat4Float4Float(inLeftVector, out);
            verifyResultsDistanceFloat4Float4Float(inLeftVector, inRightVector, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat4Float4Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRightVector(inRightVector);
            scriptRelaxed.forEach_testDistanceFloat4Float4Float(inLeftVector, out);
            verifyResultsDistanceFloat4Float4Float(inLeftVector, inRightVector, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testDistanceFloat4Float4Float: " + e.toString());
        }
    }

    private void verifyResultsDistanceFloat4Float4Float(Allocation inLeftVector, Allocation inRightVector, Allocation out, boolean relaxed) {
        float[] arrayInLeftVector = new float[INPUTSIZE * 4];
        inLeftVector.copyTo(arrayInLeftVector);
        float[] arrayInRightVector = new float[INPUTSIZE * 4];
        inRightVector.copyTo(arrayInRightVector);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLeftVector = new float[4];
            args.inRightVector = new float[4];
            // Fill args with the input values
            for (int j = 0; j < 4 ; j++) {
                args.inLeftVector[j] = arrayInLeftVector[i * 4 + j];
            }
            for (int j = 0; j < 4 ; j++) {
                args.inRightVector[j] = arrayInRightVector[i * 4 + j];
            }
            Target target = new Target(relaxed);
            CoreMathVerifier.computeDistance(args, target);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inLeftVector: ");
                    appendVariableToMessage(message, arrayInLeftVector[i * 4 + j]);
                    message.append("\n");
                }
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inRightVector: ");
                    appendVariableToMessage(message, arrayInRightVector[i * 4 + j]);
                    message.append("\n");
                }
                message.append("Expected output out: ");
                appendVariableToMessage(message, args.out);
                message.append("\n");
                message.append("Actual   output out: ");
                appendVariableToMessage(message, arrayOut[i]);
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkDistanceFloat4Float4Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public void testDistance() {
        checkDistanceFloatFloatFloat();
        checkDistanceFloat2Float2Float();
        checkDistanceFloat3Float3Float();
        checkDistanceFloat4Float4Float();
    }
}
