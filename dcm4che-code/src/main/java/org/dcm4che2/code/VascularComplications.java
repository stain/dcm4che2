/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.code;

/**
 * CID 3754 Vascular Complications.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class VascularComplications {

  /** (D3-81310, SRT, "Arterial dissection") */
  public static final String ArterialDissection = "D3-81310\\SRT";

  /** (M-39390, SRT, "AV Fistula") */
  public static final String AVFistula = "M-39390\\SRT";

  /** (M-37000, SRT, "Bleeding") */
  public static final String Bleeding = "M-37000\\SRT";

  /** (R-102B2, SRT, "Loss of distal pulse") */
  public static final String LossOfDistalPulse = "R-102B2\\SRT";

  /** (D3-89100, SRT, "Occlusion of artery") */
  public static final String OcclusionOfArtery = "D3-89100\\SRT";

  /** (M-32390, SRT, "Pseudoaneurysm") */
  public static final String Pseudoaneurysm = "M-32390\\SRT";
}
